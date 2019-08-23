/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.org.omg.CORBA.ParameterDescription;
import com.sun.org.omg.CORBA.ParameterMode;
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
       
        try {
            MethodDescriptor  mdDisplay = new MethodDescriptor(EmployeeBeans.class.getMethod("displayInfo"));
           
           MethodDescriptor arr[]={mdDisplay};
           return arr;
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(EmployeeBeansBeansInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      return null;
        
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
