{:user
 {
  :dependencies [[com.cemeric/piggieback "0.1.6-SNAPSHOT"]]
  :plugins [[cider/cider-nrepl "0.9.0-SNAPSHOT"]
            [lein-pprint "1.1.2"]]
  :repl-options {:nrepl-middleware [cemeric.piggieback/wrap-cljs-repl]
                 :init (do
                         (require 'cljs.repl.browser)
                         (require 'cljs.repl.rhino)
                         (defn start-brepl []
                           (cemeric.piggieback/cljs-repl
                            :repl-env (cljs.repl.browser/repl-env :port 9000)))
                         (defn start-rhino []
                           (cemeric.piggieback/cljs-repl
                            :repl-env (cljs.repl.rhino/repl-env))))}}} 
