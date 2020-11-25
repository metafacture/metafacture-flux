package org.metafacture.flux.tests;

import org.metafacture.flux.flux.Metaflow;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(FluxInjectorProvider.class)
public class FluxParsingTest {

    @Inject
    private ParseHelper<Metaflow> parseHelper;

    public FluxParsingTest() {
    }

    @Test
    public void shouldParseSimple() throws Exception {
        parse(
            "default base = \"\";",
            "default gndsimple = base + \"gnd-simplified.dat\";",
            "gnd|",
            "open-file|",
            "as-lines|",
            "decode-pica|",
            "morph(FLUX_DIR + \"format-gnd.xml\")|",
            "encode-formeta(style=\"concise\")|",
            "write(gndsimple);"
        );
    }

    private void parse(final String... flux) throws Exception {
        final Metaflow result = parseHelper.parse(String.join("\n", flux));
        InputOutput.println("Result: " + result);
        Assertions.assertNotNull(result);

        final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
        Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: " + IterableExtensions.join(errors, ", "));
    }

}
