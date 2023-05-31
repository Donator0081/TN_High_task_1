package org.example;


import org.example.beans.AnnotationBean;
import org.example.beans.JavaConfigBean;
import org.example.beans.JavaConfigBeanTestClass;
import org.example.beans.TestXmlBeanClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        var xmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        TestXmlBeanClass xmlBeanClass = xmlApplicationContext.getBean(TestXmlBeanClass.class);
        xmlBeanClass.displayInfo();
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfigBean.class);
        var innerConfigBean = annotationConfigApplicationContext.getBean(JavaConfigBeanTestClass.class);
        innerConfigBean.displayInfo();
        var annotationBean = annotationConfigApplicationContext.getBean(AnnotationBean.class);
        annotationBean.displayInfo();

    }

}
