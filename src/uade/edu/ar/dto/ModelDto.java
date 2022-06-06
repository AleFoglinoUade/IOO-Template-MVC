package uade.edu.ar.dto;

import uade.edu.ar.model.Model;

public class ModelDto {

    private String idModel;

    private String nameModel;

    public ModelDto(String idModel, String nameModel) {
        this.idModel = idModel;
        this.nameModel = nameModel;
    }

    public String getIdModel() {
        return idModel;
    }

    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public static Model toModel(ModelDto dto){
        return new Model(dto.getIdModel(),dto.getNameModel());
    }

    public static ModelDto toDto(Model model){
        return new ModelDto(model.getId(),model.getName());
    }
}
