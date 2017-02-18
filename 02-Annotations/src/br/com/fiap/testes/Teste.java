package br.com.fiap.testes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Animal;

public class Teste {

	public static void main(String[] args) {
	
		Animal animal = new Animal();
		
		//Recuperar os atributos da classe Animal
		
		Field[] atributos = animal.getClass().getDeclaredFields();
		
		//Exibir os nomes dos atributos
		
		for (Field field : atributos) {
			System.out.println(field.getName());
		}
		for (Field field : atributos) {
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println("Atributo: " + field.getName() + " - Coluna: " + anotacao.nome());
		}
		
		//Recuperar os métodos da Class Animal
		
		Method[] metodos = animal.getClass().getDeclaredMethods();
		for (Method method : metodos) {
			System.out.println(method.getName());
		}

	}

}
