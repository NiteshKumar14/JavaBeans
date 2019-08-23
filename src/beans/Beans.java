/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author c3
 */
public class Beans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        Class s = Class.forName("beans.EmployeeBeansBeansInfo");
        BeanInfo beanInfo = Introspector.getBeanInfo(s);
        PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor pd: propertyDescriptor) {
            System.out.println(pd.getName());
        }
        MethodDescriptor methodDescriptor[]=beanInfo.getMethodDescriptors();
        for(MethodDescriptor md:methodDescriptor)
        {
            System.out.println(md.getName());
     
        }
        
        
        
        
    }
    
}
