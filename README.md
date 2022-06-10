# MicServ_CompteService
<h3>-- Une petite demo sur le concept du micro service</h3>
<p>À la suite du cours de la programmation distribué, l'objectif de ce TP est de présenter le concept du <b><i>Micro Service</i></b> en utilisant
le <b><i>framework Spring boot</i></b> notamment on va voir comment vous pouvez créer ou bien développer une micro service, ainsi comment vous pouvez le déployer.</p>

<p><strong><b>Alors dans ce TP</b></strong>, nous avons essayé de montrer dans une petite demo, l'ensemble des étapes à suivre afin de développer un micro service 
en utilisant le framework Spring boot, ainsi d'autre techniques et méthodes qui peuvent être très utile dans les prochaines projets.</p>
<p><strong><b>Le demo</b></strong> est structuré en plusieurs parties.</br>
Voici l'image ci-dessous qui montre la structure générale du demo :
</p>

![str](https://user-images.githubusercontent.com/102219821/163493338-6da04788-6661-4021-8151-3dda5b5273f5.png)

<h4>1/ Package DTOS</h4>

![dto](https://user-images.githubusercontent.com/102219821/163493423-d7cff3f3-9af2-449a-9e8b-c0902f5611b0.png)

<h4>2/ Package Entities</h4>

![compte classe](https://user-images.githubusercontent.com/102219821/163493565-a0d7edf8-497d-4760-9a2b-46bb89f2742a.png)

<h4>3/ Package Enums</h4>
<p>Représente les différentes types qui un compte pourra être </p>

![enum](https://user-images.githubusercontent.com/102219821/163493589-ade80aec-c9d4-40eb-8995-d78d8327eadd.png)

<h4>4/ Package Enums</h4>

![reposi](https://user-images.githubusercontent.com/102219821/163493673-854f2bb9-f843-49b9-9693-7bdfa204e41b.png)

<h4>5/ Package Service</h4>
<p>Représente en fait la couche metier dont laquelle on peut exprimer et traiter les besoins fonctionnelles</p>
<h5>5.1 Interface CompteService </h5>

![service interf](https://user-images.githubusercontent.com/102219821/163493882-840d0542-c980-4f14-914f-994a66ddefee.png)

<h5>5.2 Classe CompteServiceImpl</h5>
<p>Est implémentation de l'interface CompteService</p>

![service impl](https://user-images.githubusercontent.com/102219821/163493898-5a5ea673-5e36-4ae6-b154-b2fc2fe13b21.png)

<h4>6/ Package Web</h4>
<p>Représente en fait la couche web.</p>
<h5>6.1 Classe CompteRestController</h5>

![web1](https://user-images.githubusercontent.com/102219821/163494073-7d24f6fe-d2d7-49bd-b631-e046272161e6.png)

<h5>6.2 Classe AccountRestController</h5>

![web2](https://user-images.githubusercontent.com/102219821/163494120-8ac65559-805f-4a71-9f21-53a6cdc51f5b.png)

<h4>7/ Classe CompteServiceApplication</h4>

![app](https://user-images.githubusercontent.com/102219821/163494263-374f4547-45da-4c45-8627-f5f149c4adba.png)

<h4>8/ Execution : Capture d'écrans d'execution de l'application</h4>
<br/>

![2022-06-10_183107](https://user-images.githubusercontent.com/102219821/173120312-78424de7-bf86-415b-9004-41f4fb8995f7.png)


