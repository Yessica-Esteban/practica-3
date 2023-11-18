package com.emergentes.bean;

import com.emergentes.entidades.Contacto;
import com.emergentes.jpa.ContactoJpaController;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BeanContacto {
    private EntityManagerFactory emf;
    private ContactoJpaController jpaContacto;

    public BeanContacto() {
        emf = Persistence.createEntityManagerFactory("UPagenda");
        jpaContacto = new ContactoJpaController(emf);
    }
    
    public List<Contacto> listarTodos()
    {
        return jpaContacto.findContactoEntities();
    }
    
}
