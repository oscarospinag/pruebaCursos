package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.ModalidadDTO;
import co.com.itheldigital.demo.model.Modalidad;
import co.com.itheldigital.demo.repository.ModalidadRepositiry;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModalidadServiceImp implements ModalidadService {

    @Autowired
    private ModalidadRepositiry modalidadRepositiry;


    /**
     * Metodo para buscar por id
     *
     * @param id
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public ModalidadDTO findById(Long id){

        ModalidadDTO response = null;

        Modalidad modalidad = modalidadRepositiry.findById(id).orElse(null);

        response = converterDTO(modalidad);
        return response;
    }

    /**
     * Metodo encargado de buscar por nombre de modalidad
     *
     * @param nombre
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public ModalidadDTO buscarNombre(String nombre){

        ModalidadDTO response = null;

        Modalidad modalidad = modalidadRepositiry.buscarModa(nombre);
        response = converterDTO(modalidad);
        return response;
    }


    /**
     * Metodo encargado de listar toda la modalidad
     *
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public List<ModalidadDTO> modalidadAll(){

        List<ModalidadDTO> response = new ArrayList<>();

        List<Modalidad> listModalidad = (List<Modalidad>) modalidadRepositiry.findAll();

        listModalidad.forEach(modalidad -> {
            ModalidadDTO dto = converterDTO(modalidad);
            response.add(dto);

        });

        return response;
    }

    private ModalidadDTO converterDTO(Modalidad modalidad) {

        ModalidadDTO responseDTO = new ModalidadDTO();

        responseDTO.setId(modalidad.getId());
        responseDTO.setNombre(modalidad.getNombre());
        responseDTO.setDescripcion(modalidad.getDescripcion());
        return responseDTO;
    }

}

