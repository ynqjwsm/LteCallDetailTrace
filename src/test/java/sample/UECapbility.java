package sample;

import lombok.Data;

import java.util.List;

@Data
public class UECapbility {

    public Integer ueCategory;
    public List<Integer> ratType;
    public List<Integer> bandEUTRA;
    public List<Integer> halfDuplex;
    public Integer accessStratumRelease;
    public List<Integer> FGI;

}
