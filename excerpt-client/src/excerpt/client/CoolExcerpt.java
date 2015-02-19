package excerpt.client;

import excerpt.client.service.SourceService;

/**
 * @author Shen Jiaqi
 * @version 2015/01/29
 */
public class CoolExcerpt {

    public static void main(String[] args) {
        // TODO show the initializing and loading Interface.

        SourceService sourceService = SourceService.getInstance();
        sourceService.init();

    }


}




