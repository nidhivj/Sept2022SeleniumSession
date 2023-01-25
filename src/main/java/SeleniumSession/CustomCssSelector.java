package SeleniumSession;

import org.openqa.selenium.By;

public class CustomCssSelector {

	public static void main(String[] args) {
		

		
		//  cascaded style sheet css
		//  use: logo, color of any background, hight and width, look and field of any specification
		//  font size, alignment etc..
		
		//  syntax: #id if id there
		//  .class  if class
		//  with html tag   html#id
		//  #id.class    html#id.class
		//  .class#id    html.class#id
		//  .c1.c2.c3....         html.c1.c2.c3....  (multiple classes)

		//  html[attr='value'] ..... css selectors
		//  //html[@attr='value'] ...... xpath
		
		//  html[attr='value'][attr='value'] ....... multiple attributes
		
		
		//  html[attr*='value']   for contains any value like  input[id*='input-email']  so id contains input-email
		
		//  input[id^='input'] .... starts with  using ^ for starts with
	    //  input[id$='email'] .... ends with    usig $ for ends with
		//  we can combine both start and end and contains
		//  htmltag[attr^='value'][attr$='value'][attr*=value]
		
		
		//  text()? no support in css
		
		//  parent to child:
		//   html#value>html(for child)
		//   html#value html(for child)
		//  select#Form-getForm_country > option ----> direct child
		//  select#Form-getForm_country option ----> direct + indirect child
		
		
		//  child to parent: not supported in css/ backward direction not support
		
		//  sibling in css
		//  preceding sibling not supported
		//  html[attr='value']+html ---> following sibling
		
		//  comma in css: not available in xpath
		//  input#username,input#password,button#loginBtn,input#remember  ---- 4 values added
		
		//  By mandatory_ele = By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
		
		//  indexing in css:
		//  div.row ul.footer-nav li:nth-of-type(5)   //in this we use space btw them that is for direct/indirect child
		
		//  xpath vs css:
		//  syntax: css
		//  text: xpath
		//  contains/startswith/endswith: both
		//  contains + text + attr : xpath
		//  backword traversing: xpath
		//  sibling: xpath
		//  dynamic: both
		//  comma: css
		//  indexing: xpath
		//  performance: both are better
		
		//  captcha or qr code can't be automate
		
		
		
		
		
	}

}
