(defproject sample "0.1.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-time "0.11.0"]
                 [com.stuartsierra/component "0.2.3"]
                 ;; cljs
                 [org.clojure/clojurescript "1.7.48"]
                 [reagent "0.5.1-rc3"]
                 ;; web
                 [compojure "1.3.3"]
                 [ring/ring-json "0.3.1"]
                 [http-kit "2.1.18"]
                 ;; templates
                 [selmer "0.8.2"]
                 ;; logging
                 [com.taoensso/timbre "4.0.1"]
                 ;; db
                 [org.clojure/java.jdbc "0.3.6"]
                 [postgresql/postgresql "8.4-702.jdbc4"]
                 [clojure.jdbc/clojure.jdbc-c3p0 "0.3.2"]
                 [honeysql "0.6.1"]]
  :plugins [[lein-cljsbuild "1.1.0"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src-cljs"]
                        :compiler {:output-to "resources/public/js/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
