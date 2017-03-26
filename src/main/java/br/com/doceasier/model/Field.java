package br.com.doceasier.model;

import java.lang.reflect.Modifier;

import br.com.doceasier.model.annotations.DocField;
import br.com.doceasier.model.annotations.DocMethod;
import br.com.doceasier.model.annotations.DocParam;

public class Field {

	private String name;
	private String description;
	private String type;
	private String modifier;

	public Field(java.lang.reflect.Field f) {
		if(f.isAnnotationPresent(DocField.class));{
			this.name = f.getName();
			this.type = f.getType().getCanonicalName();
			this.modifier = Modifier.toString(f.getModifiers());
			this.description = (String) f.getAnnotation(DocField.class).description();
		}
	}
}