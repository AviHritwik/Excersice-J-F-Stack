package customAnotation;

public @interface MultiValueDefaultAnnEx {
	String name() default "Name";
	int x() default 1;
}
