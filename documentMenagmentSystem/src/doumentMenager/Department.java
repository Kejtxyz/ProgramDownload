package doumentMenager;

import javax.swing.text.Document;
import java.util.Collection;

public class Department {

    private Collection<Department> departments;

    public Department(){
        departments = allDepartments();

    }

    void delegeteDocument(Document document, Department department){


    public boolean handle(Document document) {  // kazdy moze decydowac czy jakis z dzialow zostal zhandlowany, i department moze oddeleowac decyzje do innych ddepartmentow, odzialow.

        if (canHandle(document))
            document.setProcessed(true);
        return true;
    }
    return true;
}

    private boolean documentIsProcessed(Document document){
       return !departments.stream()
               .filter(department -> department.handle(document))
               .findAny()
               .isPresent();

    }
}
