package org.columbia.controller;

import org.columbia.dto.PartOfSpeechDto;
import org.columbia.dto.TextDto;
import org.columbia.entity.PartOfSpeech;
import org.columbia.entity.Text;
import org.columbia.service.LanguageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PartOfSpeechController {

    /**
     * test comment!
     */

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/api/language/pos", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getText() {
        return ResponseEntity.ok("success!");
    }

    @RequestMapping(value = "/api/language/pos", method = RequestMethod.POST)
    @ResponseBody
    public List<PartOfSpeechDto> postText(@Valid @RequestBody TextDto textDto) {
        Text text = convertToEntity(textDto);
        List<PartOfSpeech> posEntities = languageService.parseEnglishSentence(text);
        return posEntities.stream()
                .map(parsedPosEntity -> convertToDto(parsedPosEntity))
                .collect(Collectors.toList());
    }

    private PartOfSpeechDto convertToDto(PartOfSpeech posEntity) {
        PartOfSpeechDto posDto = modelMapper.map(posEntity, PartOfSpeechDto.class);
        return posDto;
    }

    private Text convertToEntity(TextDto textDto) {
        Text text = modelMapper.map(textDto, Text.class);
        return text;
    }


}