(ns tech-crawler.core)

(defn read [env key params]
  (when (= :foo key)
    {:remote true}))

(def parser
  (om/parse {:read read}))

(defn mutate [env key params]
  ())

(defmethod mutate 'increment/it!)
