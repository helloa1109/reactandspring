package data.controller;

import data.dto.InfoDto;
import data.service.InfoServiceInter;
import naver.cloud.NcpObjectStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoServiceInter infoService;

    @Autowired
    private NcpObjectStorageService storageService;

    //버켓이름지정
    private String bucketName="bit701-bucket-107";//각자 자기 버켓이름

    //버켓 경로
    String bucketPath="https://kr.object.ncloudstorage.com/bit701-bucket-107/react/";

    @PostMapping("/insert")
    public void insertInfo(@RequestBody InfoDto dto)
    {
        System.out.println("insert>>>"+dto);
        infoService.insertInfo(dto);
    }

    @GetMapping("/photo")
    public String updatePhoto(@RequestParam int num, @RequestParam MultipartFile upload) {
        System.out.println("update >> " + num + " >> " + upload.getOriginalFilename());
        // 스토리지에 사진을 업로드 후 업로드된 이름을 반환
        String uploadName = storageService.uploadFile(bucketName, "react", upload);

        // 사진 수정
        infoService.updatePhoto(num, uploadName);
        // 사진경로 반환
        return uploadName;
    }

    @GetMapping("/list")
    public List<InfoDto> list()
    {
        return infoService.list();
    }

    @DeleteMapping("/delete/{num}")
    public void deleteInfo(@PathVariable int num)
    {
        //num에 해당하는 이미지명 얻기
        String photo = infoService.getData(num).getPhoto();
        //bucket 에서 삭제
        storageService.deleteFile(bucketName, "react" , photo);
        //db 에서 데이터 삭제하기
        infoService.deleteInfo(num);
    }
}
