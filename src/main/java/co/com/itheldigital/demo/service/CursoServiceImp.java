package co.com.itheldigital.demo.service;

import co.com.itheldigital.demo.dto.CursoDTO;
import co.com.itheldigital.demo.model.Cursos;
import co.com.itheldigital.demo.repository.CursosRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursosRepository cursosRepository;

    /**
     * Metodo encargado de agregar un curso
     *
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public CursoDTO agregar(CursoDTO cursoDTO){

        CursoDTO response = null;

        Cursos cursosDb = new Cursos();

        try {

            cursosDb.setId(cursoDTO.getId());
            cursosDb.setNombre(cursoDTO.getNombre());
            cursosDb.setDirigido(cursoDTO.getDirigido());
            cursosDb.setCosto(cursoDTO.getCosto());
            cursosDb.setModalidad(cursoDTO.getModalidad());
            cursosDb.setDescripcion(cursoDTO.getDescripcion());
            cursosDb.setHoras(cursoDTO.getHoras());

            Cursos responseDB = cursosRepository.save(cursosDb);

            response = converterDTO(cursosDb);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }


    /**
     * Metodo encargado de editar un curso
     *
     * @param cursoDTO
     * @return
     * @throws ServiceException
     * @autor Alvaro Machado
     */
    @Override
    public CursoDTO editar(CursoDTO cursoDTO){

        CursoDTO response = null;
        Cursos cursosDb = new Cursos();
        try {
            cursosDb.setId(cursoDTO.getId());
            cursosDb.setCosto(cursoDTO.getCosto());
            cursosDb.setDescripcion(cursoDTO.getDescripcion());
            cursosDb.setDirigido(cursoDTO.getDirigido());
            cursosDb.setHoras(cursoDTO.getHoras());
            cursosDb.setModalidad(cursoDTO.getModalidad());
            cursosDb.setNombre(cursoDTO.getNombre());

            Cursos responseDB = cursosRepository.save(cursosDb);

            response = converterDTO(cursosDb);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    private CursoDTO converterDTO(Cursos cursos) {

        CursoDTO responseDTO = new CursoDTO();

        responseDTO.setId(cursos.getId());
        responseDTO.setNombre(cursos.getNombre());
        responseDTO.setHoras(cursos.getHoras());
        responseDTO.setDescripcion(cursos.getDescripcion());
        responseDTO.setCosto(cursos.getCosto());
        responseDTO.setDirigido(cursos.getDirigido());
        responseDTO.setModalidad(cursos.getModalidad());
        return responseDTO;
    }

}
