(defproject fractional "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [liberator "0.15.1"]
                 [compojure "1.6.0"]
                 [ring/ring-core "1.6.3"]
                 [org.clojure/core.typed "0.3.21"]]
  :plugins [[lein-typed "0.4.2"]
            [lein-ring "0.12.2"]]
  :injections [(require 'clojure.core.typed)
               (clojure.core.typed/install)]
  :ring {:handler fractional.core/handler})
