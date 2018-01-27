(ns fractional.core
  (:require [liberator.core :refer [resource defresource]]
            [clojure.data.json :as json]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes ANY]]))

(defroutes app
  (ANY "/" [] (resource :available-media-types ["application/json"]
                           :handle-ok (fn [ctx]
                                        (json/json-str {:message "Hello world!"})))))

(def handler 
  (-> app 
      wrap-params))
