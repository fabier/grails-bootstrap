class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?" {
            constraints {
                // apply constraints here
                id(matches: /\d*/)
            }
        }

        "/"(view: "index")
        "404"(view: '/error/404')
        "500"(view: '/error/500')
    }
}
