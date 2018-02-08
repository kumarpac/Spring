package org.pawan.springbean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApps {

	public static void main(String[] args) {
		// Triangle tr = new Triangle();
		// tr.draw();

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/home/pawan/workspace/SpringFrameworkLearning/src/org/pawan/springbean/spring.xml"));
		Triangle tr = (Triangle)factory.getBean("triangle");
		tr.draw();

	}

}
