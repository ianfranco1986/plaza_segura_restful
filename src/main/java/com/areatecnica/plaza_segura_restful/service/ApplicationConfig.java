/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.areatecnica.plaza_segura_restful.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ianfr
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.areatecnica.plaza_segura_restful.service.AlertaFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.AlertaPersonaInteresFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.AntecedentesFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.CamaraFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.CiudadFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.ComunaFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.MenuFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.NacionalidadFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.PersonaInteresFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.PrivilegioFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.RegionFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.RolFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.RolMenuFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.TipoAlertaFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.TipoCamaraFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.TipoUsuarioFacadeREST.class);
        resources.add(com.areatecnica.plaza_segura_restful.service.UsuarioFacadeREST.class);
    }
    
}
