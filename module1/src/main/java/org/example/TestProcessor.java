package org.example;

import io.avaje.config.Config;
import io.avaje.prism.GenerateAPContext;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@GenerateAPContext
@SupportedAnnotationTypes({"*"})
public final class TestProcessor extends AbstractProcessor {


    @Override
    public synchronized void init(final ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnvironment) {

        Config.asConfiguration().asProperties().forEach((key, value) -> {
            System.err.println(key + " --> " + value);
        });

        return true;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

}
