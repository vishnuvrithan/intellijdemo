package org.reflections.scanners;

/** scan field annotations.
 * <i>{@code Deprecated}, use {@link Scanners#FieldsAnnotated} instead</i> */
@Deprecated
public class FieldAnnotationsScanner extends AbstractScanner {

    /** <i>{@code Deprecated}, use {@link Scanners#FieldsAnnotated} instead</i> */
    @Deprecated
    public FieldAnnotationsScanner() {
        //Here also i will make changes
        super(Scanners.FieldsAnnotated);
    }
}
