package methods.overridding;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class OverridingException extends MyClass{

    /*

    for unchecked exception, there is no boundation or rule

    for checked exception if child is throwing checked exception, parent must throw same or its parent class exception



    if child class is throwing any unchecked exception, no need to worry at all, parent can or can not throw any exception


    only case where we need to worry is when child throws checked exception, it must be thrown by parent also then

    or its parent exception must be thrown by parent

    child throwing checked exception
    parent must throw same exception or its parent exception


     */


    @Override
    public void m1() {

    }

    //child method can not throw any exception at all, while parent throws checked

    @Override
    public void m2() {

    }

    @Override
    public void m3() throws FileNotFoundException, FileSystemException {

    }

    // child throwing same exception as parent method
    @Override
    public void m4() throws Exception{

    }


    // child throwing child of parents type checked exception
    @Override
    public void m5() throws FileNotFoundException{

    }


    // child throwing same type checked exception
    public void m6() throws FileNotFoundException {}
}


class MyClass {


    public void m1() throws NullPointerException{}

    public void m2() throws FileNotFoundException {}

    public void m3() throws Exception {}

    public void m4() throws Exception {}

    public void m5() throws Exception {}

    public void m6() throws FileNotFoundException {}

}