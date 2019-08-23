/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c3
 */
public class EmployeeBeansBeansInfo extends SimpleBeanInfo{

    @Override
    public MethodDescriptor[] getMethodDescriptors()  {
        Method[] methods = EmployeeBeans.class.getMethods();
        for (Method method : methods) {
            System.out.println("****" + method.getName() + "****");
        }
        MethodDescriptor mdDisplay=new MethodDescriptor(methods[0]);
        
        return new MethodDescriptor[]{mdDisplay};
        
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        
        try {
            PropertyDescriptor pdName= new PropertyDescriptor("empName", beans.EmployeeBeans.class);
            PropertyDescriptor pdId=new PropertyDescriptor("empId", beans.EmployeeBeans.class);
           PropertyDescriptor array[]={pdName,pdId};
           return array;
        } catch (IntrospectionException ex) {
            Logger.getLogger(EmployeeBeansBeansInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
     return null;
    }
    
    
}
