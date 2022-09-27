package com.jtrf.action;

import java.util.ArrayList;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.jtrf.model.TruckBean;

public class DemoSpelAction {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression express1 = parser.parseExpression("'hola,'+'Amigo!!'");
		
		String result1 = express1.getValue().toString();
		System.out.println("result1: "+result1);

		Expression express2 = parser.parseExpression("2*3+1");
		
		int result2 = express2.getValue(Integer.class);
		System.out.println("result2+1: "+(result2+1));
		
		EvaluationContext ectx =new StandardEvaluationContext();
		
		TruckBean truck1 = new TruckBean(101,"ford");
		TruckBean truck2 = new TruckBean(102,"honda");
		
		ArrayList<TruckBean> trucks = new ArrayList<TruckBean>();
		trucks.add(truck1);
		trucks.add(truck2);
		
		ectx.setVariable("trucks", trucks);
		
		String brand = parser.parseExpression("#trucks[1].brand").getValue(ectx,String.class);
		System.out.println("Brand: "+brand);
		
	}

}
