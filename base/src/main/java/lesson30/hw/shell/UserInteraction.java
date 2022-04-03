//package lesson30.hw.shell;
//
//import lesson29.service.LocalizationService;
//import lesson30.hw.CityRunner;
//import lesson30.hw.dao.CityDao;
//import lesson30.hw.model.City;
//import lesson30.hw.service.CityService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.shell.standard.ShellComponent;
//import org.springframework.shell.standard.ShellMethod;
//import org.springframework.shell.standard.ShellMethodAvailability;
//import org.springframework.shell.standard.ShellOption;
//
//@ShellComponent
//@RequiredArgsConstructor
//@Slf4j
//public class UserInteraction {
//
//    private final CityService cityService;
//
//
//    @ShellMethod(value = "Create city", key = "cc")
//    @ShellMethodAvailability("isAvailable")
//    public void saveCity(
//            @ShellOption({"-r", "--nr"}) String nameRus,
//            @ShellOption({"-e", "--ne"}) String nameEng,
//            @ShellOption({"-p", "--pc"}) long population) {
//        final  City city = new City(nameRus, nameEng, population);
//        cityService.save(city);
//        log.info("В справочник добавлен город {}", city);
//    }
//
//}
