package com.geven.headsoccer.handler;

public class VariablesHandler {
    public static String countries[] = {"AFGHANISTAN","ALBANIË","ALGERIJE","AMERIKAANS-SAMOA","ANDORRA","ANGOLA","ANGUILLA","ANTIGUA EN BARBUDA","ARGENTINIË","ARMENIË","ARUBA","AUSTRALIË","AZERBEIDZJAN","BELGIË","BERMUDA","BHUTAN","BOSNIË","BRAZILIË","BULGARIJE","CAMBODJA","CHILI","CHINA","NEDERLAND"};   //String array with all the countries that is showed in the menu
    public static String myCountry = "";                    //It's initialize to avoid a nullpointerexception

    public static String finalCompetition[];                //This variable is used to set a existing variable array to this array


    //List of teams in a country:
    public static String AFGHANISTAN[] = {"OQABAN HINDUKUSH","DE SPIN GHAR BAZAN","DE MAIWAND ATALAN","SHAHEEN ASMAYEE","TOOFAAN HARIROD","MAWJHAI AMU","DE ABASIN SAPE","SIMORGH ALBORZ"};
    public static String ALBANIË[] = {"KF LACI","KF TIRANE","FK KUKESI","KS BYLIS BALLSHI","FK PARTIZANI","FK VLLAZNIA SHKODER","KF TEUTA DURRES","KF SKENDERBEU KORCE","KS FLAMURTARI VLORE","KF TERBUNI"};
    public static String ALGERIJE[] = {"JS KABYLIE","DRB TRADJENANET","USM BLIDA","NA HUSSEIN-DEY","USM EL HARRACH","ES SETIF","CS CONSTANTINE","JS SAOURA","CR BELOUIZDAD","MC ALGER","MC ORAN","USM ALGER","ASM ORAN","MO BEJAIA","RC RELIZANE","RC ARBA"};
    public static String AMERIKAANS_SAMOA[] = {"UTULEI YOUTH","LION HEART FC","FC SKBC","VAIALA TONGAN","PANSA SC","TAFUNA JETS"};
    public static String ANDORRA[] = {"FC ENCAMP","FC LUSITANOS","UE SANTA COLOMA","UE SANT JULIA","FC SANTA COLOMA","FC ORDINO","PENYA ENCARNADA","UE ENGORDANY"};
    public static String ANGOLA[] = {"CRD DO LIBOLO","SPORT LUANDA","KABUSCORP SC","CD PRIMEIRO DE AGOSTO","GD INTERCLUBE","CD PROGRESSO","ATLETICO PETROLEOS","PROGRESSO","FC ONZE BRAVOS","GD SAGRADA EXPERANCA","ACADEMICA PETROLEOS","CLUBE DESPORTIVO","ATLETICO SPORT AVIACAO","SC PETROLEOS","CLUBE RECREATIVO","DOMANT FC"};
    public static String ANGUILLA[] = {"KICKS UNITED FC","ROARING LIONS FC","ATTACKERS FC","SALSA BALLERS FC","ALHCS SPARTAN FC","DIAMOND FC",};
    public static String ANTIGUA_EN_BARBUDA[] = {"PARHAM FC","GREENBAY HOPPERS","SAP FC","GRENADES FC","FORT ROAD FC","OTTOS RANGERS FC","OLD ROAD FC","FIVE ISLANDS FC","BASSA SC","URLINGS GOLDEN STARS"};
    public static String ARGENTINIË[] = {"BOCA JUNIORS","SAN LORENZO","CA RIVER PLATE","ROSARIO CENTRAL","RACING CLUB","CA BELGRANO","CA TIGRE","GIMNASIA","CA BANFIELD","CA LANUS","ESTUDIANTES","CA INDEPENDIENTE","CA UNION","CA OLD BOYS","CA ALDOSIVI","ARGENTINOS JUNIORS","CA SAN MARTIN","VELEZ SARSFIELD"};
    public static String ARMENIË[] = {"FC PYUNIK YEREVAN","ULISSES FC","SHIRAK FC","ALSHKERT FC","FC MIKA YEREVAN","FC BANANTS","GANDZASAR FC","FC ARARAT"};
    public static String ARUBA[] = {"SV RACING CLUB","SV BRITANNIA","BUBALI SC","SV ESTRELLA","SV DAKOTA","SV LA FAMA","SV DEPORTIVO","SV RIVERPLATE","FC SAN NICOLAAS","SV BRAZIL JUNIORS"};
    public static String AUSTRALIË[] = {"PERTH GLORY FC","CENTRAL COAST MARINERS","NEWCASTLE UNITED JETS","ADELAIDE UNITED","BRISBANE ROAR","SYDNEY FC","MELBOURNE VICTORY","WELLINGTON PHOENIX","MELBOURNE CITY","WESTERN SYDNEY"};
    public static String AZERBEIDZJAN[] = {"QARABAG AGDAM","INTER PFK","QEBELE FK","NEFTCI PFK","SIMURQ PIK","AZAL PFK","XEZER LENKERAN","SUMQAYIT","BAKI FK","ARAZ-NAXICIVAN"};
    public static String BELGIË[] = {"ANDERLECHT","GENT","CLUB BRUGGE","GENK","KORTRIJK","KV OOSTENDE","WAASLAND BEVEREN","OH LEUVEN","STANDARD LIEGE","MECHELEN","ZULTE-WAREGEM","LOKEREN","SPORTING CHARLEROI","SINT-TRUIDEN","WESTERLO","MOUSCRON-PERUWELZ",};
    public static String BERMUDA[] = {"DEVONSHIRE COUGARS","BOULEVARD BLAZERS","DANDY TOWN","NORTH VILLAGE","HAMILTON PARISH","PHC ZEBRAS","SOUTHAMPTON RANGERS","DEVONSHIRE COLTS","SOMERSET CC","ROBIN HOOD FC",};
    public static String BHUTAN[] = {"THIMPHU FC","UGYEN ACADEMY","THIMPHU CITY","FC TERTONS","BHUTAN CLEARING","PARO UNITED"};
    public static String BOSNIË[] = {"FK SARAJEVO","FK BORAC","ZRINJSKI MOSTAR","NK CELIK","NK TRAVNIK","NK SIROKI","FK OLIMPIC","FK SLOBODA","NK VITEZ","FK SLAVIJA","FK ZELJEZNICAR","FK VELEZ","FK RADNIK","FK RUDAR","FK DRINA","FK MLADOST"};
    public static String BRAZILIË[] = {"CA MINEIRO","SC CORINTHIANS","SC PALMEIRAS","SC RECIFE","SAO PAULO FC","GREMIO","FLUMINENSE","CA PARANAENSE","CHAPECOENSE AF","SC INTERNACIONAL","AA PONTE PRETA","CR FLAMENGO","CRUZEIRO EC","AVAI FC","SANTOS FC","FIGUEIRENSE FC","GOIAS EC","VASCO DA GAMA","CORITIBA FC","JOINVILLE EC"};
    public static String BULGARIJE[] = {"PFK LUDOGORETS","PFK LOKOMOTIV","PFK LITEX","PFK BEROE STARA","FK BOTEV","PFK LEVSKI","PFK CHERNO","PFK SLAVIA","PFK LOKOMOTIV","OFK PIRIN"};
    public static String CAMBODJA[] = {"BOEUNG KET","PHNOM PENH CROWN","CAMBODIAN TIGER","SVAY RIENG","NATIONAL POLICE","BUILD BRIGHT UNITED","NAGAWORLD FC","NATIONAL DEFENSE","WESTERN PHNOM","CMAC UNITED","ASIA EURO UNITED","KIRIVONG FC"};
    public static String CHILI[] = {"CSD COLO-COLO","CF UNIVERSIDAD DE CHILE","CD AUDAX ITALIANO","CD UNIVERSIDAD CONCEPCION","CD UNIVERSIDAD CATOLICA","UNION ESPANOLA","CD COBRESAL","CD HUACHIPATO","CD O HIGGINS","CD ANTOFAGASTA","CD IQUIQUE","CD SANTIAGO","CD UNION LA CALERA","CD PALESTINO","CD SAN LUIS","CDC SAN MARCOS"};
    public static String CHINA[] = {"SHANGHAI SIPG","GUANGZHOU","SHANDONG","BEIJING GUOAN","SHIJIAZHUANG","SHENGHAI GREENLAND","JIANGSU","HENAN JIANYE FC","CHANGCHUN YATAI","CHONGQING LIFAN","GUANGZHOU FC","GUIZHOU RENHE","HANGSZHOU GREENTOWN","TIANJIN TEDA","LIAONING","SHANGHAI SHENXIN",};

    public static String NEDERLAND[] = {"PSV","AJAX","FEYENOORD","AZ","SC HEERENVEEN","FC TWENTE","VITESSE","NEC","RODA JC","FC UTRECHT","HERACLES ALMELO","FC GRONINGEN","ADO DEN HAAG","PEC ZWOLLE","WILLEM II","SC CAMBUUR","DE GRAAFSCHAP","EXCELSIOR"};

    public static String myTeam, computerTeam;      //Set the home team and the away team. The home team is myTeam and the away team is computerTeam.
}
