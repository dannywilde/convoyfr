<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/ObjectiveScenarios/Q_Hyperdrive_PrivateerStart2.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>226</x>
        <y>119</y>
        <center>
          <x>301.5</x>
          <y>169.5</y>
        </center>
        <width>151</width>
        <height>101</height>
        <xMin>226</xMin>
        <yMin>119</yMin>
        <xMax>377</xMax>
        <yMax>220</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Vous arrivez aux coordonnées fournies par Andy, quand il commence à dire:

"Il n'y a que des arbres et l'obscurité, mon frère, Un pays vraiment obscur! Juste le lieu de la bonne vieille ultra-violence!"
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>What's the plan?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>201</x>
        <y>446</y>
        <center>
          <x>295</x>
          <y>496</y>
        </center>
        <width>188</width>
        <height>100</height>
        <xMin>201</xMin>
        <yMin>446</yMin>
        <xMax>389</xMax>
        <yMax>546</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Andy rit de bonheur après le carnage que vous avez fait.

"Victimes de l'âge moderne, ô mon frère!"

Vous sortez un survivant des épaves.

[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>176</x>
                <y>65</y>
                <center>
                  <x>181</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>176</xMin>
                <yMin>65</yMin>
                <xMax>186</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Interroger le survivant.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>565</x>
        <y>19</y>
        <center>
          <x>678.5</x>
          <y>114.5</y>
        </center>
        <width>227</width>
        <height>191</height>
        <xMin>565</xMin>
        <yMin>19</yMin>
        <xMax>792</xMax>
        <yMax>210</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Viddy well, vous pouvez voir les Privateers misérables et leurs méthodes de salauds à présent."

Andy vous montre un lointain nuage de poussière. Vous dicernez plusieurs véhicules.

"Un raid de Privateers, qui se précipite sur les plus faibles pour le sport et l'appat du gain. Ils méritent la mort.

Tuer ce groupe ne résoudra pas l'infection. Nous devons trouver la source... puis les tuer TOUS!

Vous me demander ce qu'est la sagesse ?"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>215</x>
                <y>65</y>
                <center>
                  <x>220</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>65</yMin>
                <xMax>225</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>215</x>
                <y>83</y>
                <center>
                  <x>220</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>83</yMin>
                <xMax>225</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Détruisez les, vous poserez des question ensuite.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>215</x>
                <y>127</y>
                <center>
                  <x>220</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>127</yMin>
                <xMax>225</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Suivez les jusqu'à leur base.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>215</x>
                <y>171</y>
                <center>
                  <x>220</x>
                  <y>176</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>215</xMin>
                <yMin>171</yMin>
                <xMax>225</xMax>
                <yMax>181</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Contactez les par Radio.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>891</x>
        <y>-493</y>
        <center>
          <x>1069</x>
          <y>-428.5</y>
        </center>
        <width>356</width>
        <height>129</height>
        <xMin>891</xMin>
        <yMin>-493</yMin>
        <xMax>1247</xMax>
        <yMax>-364</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy sourit largement.

"Une furieuse envie de se battre, hein? Merveilleux!

ça me semble bien, assurez vous juste de ne pas tous les tuer avant d'avoir l'occasion de leur parler!"

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableMineField">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="EnableWarZone">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Faire feu.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1014</x>
        <y>-329</y>
        <center>
          <x>1187</x>
          <y>-264.5</y>
        </center>
        <width>346</width>
        <height>129</height>
        <xMin>1014</xMin>
        <yMin>-329</yMin>
        <xMax>1360</xMax>
        <yMax>-200</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Ne soit pas si pressé, petit frère. Vous ne voulez pas finir en épaves comme leurs victimes précédentes

à présent vous les comprennez, preuve de votre faible santée mentale! C'est bien plus excitant de les combattre au milieu de leur proie précédente. Le chasseur devient la proie, une véritable vision d'horreur." </Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="EnableWarZone">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Combattez-les au milieu des épaves.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attendez un moment plus favorable pour les attaquer.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>470</x>
        <y>494</y>
        <center>
          <x>616.5</x>
          <y>558.5</y>
        </center>
        <width>293</width>
        <height>129</height>
        <xMin>470</xMin>
        <yMin>494</yMin>
        <xMax>763</xMax>
        <yMax>623</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Le Privateer est rapidement persuadé de révéler l'emplacement de leur base.

Andy acquiesce.

"Nous avons ce dont nous avions besoin. Alors, devons-nous tuer cet imbécile qui chiale ?"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>281</x>
                <y>65</y>
                <center>
                  <x>286</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>281</xMin>
                <yMin>65</yMin>
                <xMax>291</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Fait nous les honneurs, Andy.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>281</x>
                <y>109</y>
                <center>
                  <x>286</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>281</xMin>
                <yMin>109</yMin>
                <xMax>291</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Abandonnons le ici.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>939</x>
        <y>409</y>
        <center>
          <x>1036</x>
          <y>460.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>939</xMin>
        <yMin>409</yMin>
        <xMax>1133</xMax>
        <yMax>512</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy tire un couteau de sa manche et tranche d'un coup sec la gorge du Privateer.

"En route pour la base... Il y a quelques meurtres de plus à perpétrer."
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>Vous avez appris l'emplacement de la base des Privateers de la route après avoir interrogé le survivant.
              Vous fondez sur la base prêt à en découdre.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>927</x>
        <y>606</y>
        <center>
          <x>1024</x>
          <y>657.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>927</xMin>
        <yMin>606</yMin>
        <xMax>1121</xMax>
        <yMax>709</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy semble déçu, mais vos décisions vous regardent.

"Hâtons-nous d'aller à la base des Privateers. Je sais que vous le laisserez pas ces salauds vivre!"

Le Privateer s'enfuit, vous doutez de sa survie sans véhicule.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>Vous avez appris l'emplacement de la base des Privateers après avoir interrogé le survivant.

Vous fondez sur la base prêt à en découdre.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>En route!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1081</x>
        <y>-160</y>
        <center>
          <x>1178</x>
          <y>-108.5</y>
        </center>
        <width>194</width>
        <height>103</height>
        <xMin>1081</xMin>
        <yMin>-160</yMin>
        <xMax>1275</xMax>
        <yMax>-57</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy sourit.

"Un choix judicieux, bien qu'un peu moins excitant que simplement les tuer.

Ensuite, nous irons. Vers leur saleté de nid!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_Tracking2</nodeName>
              <nodeDiscription>Andy vous montre quelques Privateers.

Vous avez décidé d'essayer de les suivre à leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>En route.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1066</x>
        <y>-17</y>
        <center>
          <x>1145</x>
          <y>34.5</y>
        </center>
        <width>158</width>
        <height>103</height>
        <xMin>1066</xMin>
        <yMin>-17</yMin>
        <xMax>1224</xMax>
        <yMax>86</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy semble un peu perplexe.

"Parler avec ces salauds comme si c'était des gens honnêtes ? UN choix étrange, mais je suis curieux de voir le résultat.

Montrez-moi vos talents de diplomate l'ami!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>146</x>
                <y>65</y>
                <center>
                  <x>151</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>146</xMin>
                <yMin>65</yMin>
                <xMax>156</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>146</x>
                <y>83</y>
                <center>
                  <x>151</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>146</xMin>
                <yMin>83</yMin>
                <xMax>156</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Parlementer avec les Privateers.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1498</x>
        <y>-199</y>
        <center>
          <x>1573</x>
          <y>-149</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1498</xMin>
        <yMin>-199</yMin>
        <xMax>1648</xMax>
        <yMax>-99</yMax>
      </GraphRect>
      <Name>New dialogs</Name>
      <Text>Les Privateers ne semblent pas intéressés à la conversation, car ils ignorent vos demandes..

Ils semblent intéressés à se battre, leurs véhicules s'approchent de votre convoi avec des armes chargées.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Préparez-vous à combattre!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1449</x>
        <y>-52</y>
        <center>
          <x>1549</x>
          <y>52.5</y>
        </center>
        <width>200</width>
        <height>209</height>
        <xMin>1449</xMin>
        <yMin>-52</yMin>
        <xMax>1649</xMax>
        <yMax>157</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Les Privateers répondent à vos demandes.

«Vous avez un certain culot de tenter de vouloir parlementer avec nous! Mais merci de nous avoir fait part de votre position.

Parlez vite, avant que nous pillons votre convoi!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>65</y>
                <center>
                  <x>193</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>65</yMin>
                <xMax>198</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>83</y>
                <center>
                  <x>193</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>83</yMin>
                <xMax>198</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Les menacer.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>127</y>
                <center>
                  <x>193</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>127</yMin>
                <xMax>198</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>12</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>145</y>
                <center>
                  <x>193</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>145</yMin>
                <xMax>198</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Offre de commerce.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>188</x>
                <y>189</y>
                <center>
                  <x>193</x>
                  <y>194</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>188</xMin>
                <yMin>189</yMin>
                <xMax>198</xMax>
                <yMax>199</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Changement de plan, Attaquez les.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2031</x>
        <y>51</y>
        <center>
          <x>2175.5</x>
          <y>133.5</y>
        </center>
        <width>289</width>
        <height>165</height>
        <xMin>2031</xMin>
        <yMin>51</yMin>
        <xMax>2320</xMax>
        <yMax>216</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Hrrm.... vous avez toute notre attention, qu'offrez-vous et qu'est ce que vous voulez?"
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>65</y>
                <center>
                  <x>282</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>65</yMin>
                <xMax>287</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>16</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>83</y>
                <center>
                  <x>282</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>83</yMin>
                <xMax>287</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>17</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Des indices sur l'emplacement de leur base.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>127</y>
                <center>
                  <x>282</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>127</yMin>
                <xMax>287</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>18</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>277</x>
                <y>145</y>
                <center>
                  <x>282</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>277</xMin>
                <yMin>145</yMin>
                <xMax>287</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>19</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Les attirer dans une embuscade.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1755</x>
        <y>109</y>
        <center>
          <x>1830</x>
          <y>159</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1755</xMin>
        <yMin>109</yMin>
        <xMax>1905</xMax>
        <yMax>209</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Vous pensez que nous somme juste des simples marchands? 

Nous en somme loin, nous sommes les puissants Privateers! Préparez-vous à être punis pour votre insolence!"

Andy grogne tranquillement.
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Armes prêtes!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1760</x>
        <y>-19</y>
        <center>
          <x>1835</x>
          <y>31</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1760</xMin>
        <yMin>-19</yMin>
        <xMax>1910</xMax>
        <yMax>81</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Vous nous menacez ? C'est une plaisanterie ?

Preparez-vous à en découdre!"

Andy grogne tranquillement.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Armes prêtes!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1794</x>
        <y>-419</y>
        <center>
          <x>1890</x>
          <y>-354.5</y>
        </center>
        <width>192</width>
        <height>129</height>
        <xMin>1794</xMin>
        <yMin>-419</yMin>
        <xMax>1986</xMax>
        <yMax>-290</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Woahhh, voter convoi est bien plus armé que nous le somme.

Nous nous rendons, nous vous laisserons tranquilles désormais! Laissez-nous vivre!"

Andy ricanement tranquillement.

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>180</x>
                <y>65</y>
                <center>
                  <x>185</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>180</xMin>
                <yMin>65</yMin>
                <xMax>190</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>21</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Où est votre base ?</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>180</x>
                <y>109</y>
                <center>
                  <x>185</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>180</xMin>
                <yMin>109</yMin>
                <xMax>190</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Lâches, préparez-vous à mourir!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2502</x>
        <y>-215</y>
        <center>
          <x>2599.5</x>
          <y>-132.5</y>
        </center>
        <width>195</width>
        <height>165</height>
        <xMin>2502</xMin>
        <yMin>-215</yMin>
        <xMax>2697</xMax>
        <yMax>-50</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Quoi? C'est... bien amené.

To be honest, we've had out share of looting and plundering. If you pay us [0$] we'll be able to start a new life.

En échange nous serons ravis de vous dire où se trouve notre base."

Andy acquiesce.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>65</y>
                <center>
                  <x>188</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>65</yMin>
                <xMax>193</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-100</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>83</y>
                <center>
                  <x>188</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>83</yMin>
                <xMax>193</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-200</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>101</y>
                <center>
                  <x>188</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>101</yMin>
                <xMax>193</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>20</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>-300</Amount>
              <fuelAmount>0</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Les payer.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>183</x>
                <y>145</y>
                <center>
                  <x>188</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>183</xMin>
                <yMin>145</yMin>
                <xMax>193</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>On va plutôt vous tuer.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2483</x>
        <y>17</y>
        <center>
          <x>2558</x>
          <y>67</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2483</xMin>
        <yMin>17</yMin>
        <xMax>2633</xMax>
        <yMax>117</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Quoi? Pourquoi vous donner l'emplacement de notre base d'opérations?

J'en ai assez de ces sornettes, préparez-vous à en découdre!

Andy sourit largement.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2489</x>
        <y>206</y>
        <center>
          <x>2564</x>
          <y>256</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2489</xMin>
        <yMin>206</yMin>
        <xMax>2639</xMax>
        <yMax>306</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vomissez des mensonges au sujet du commerce de fret pour les Privateers, qui mordent à l'appât et conduisent droit dans votre embuscade.

Cela devrait rendre le combat considérablement plus facile.

Andy hoche la tête.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2487</x>
        <y>332</y>
        <center>
          <x>2562</x>
          <y>382</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2487</xMin>
        <yMin>332</yMin>
        <xMax>2637</xMax>
        <yMax>432</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vomissez des mensonges au sujet du commerce de fret pour les corsaires, qui semblent intéressés, mais sont assez sages pour garder leurs armes chargées en s'attendant au pire.

Aucun avantage n'a été obtenu.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="StartBattle">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>0</x>
                <y>0</y>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <width>0</width>
                <height>0</height>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2799</x>
        <y>-191</y>
        <center>
          <x>2896</x>
          <y>-141</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2799</xMin>
        <yMin>-191</yMin>
        <xMax>2993</xMax>
        <yMax>-91</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous payez les corsaires qui vous donnent les coordonnées de leur ancienne base.

Andy lève un sourcil.

"Payer les salauds et les laisser vivre? Quelle déception.

Je suppose que votre diplomatie a été impressionnante, cependant. Allons à la base des Privateers et tuons-les tous! Plus de diplomatie!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>Vous avez obtenu l'emplacement de base des Privateers en donnant à certains d'entre eux suffisamment de pièces pour commencer une nouvelle vie.

Vous fondez sur la base pour tous les tuer.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>En route!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2063</x>
        <y>-465</y>
        <center>
          <x>2138.5</x>
          <y>-400.5</y>
        </center>
        <width>151</width>
        <height>129</height>
        <xMin>2063</xMin>
        <yMin>-465</yMin>
        <xMax>2214</xMax>
        <yMax>-336</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Nous parlerons, nous parlerons. Laissez-nous vivre!"

Les Privateers vous donnent l'emplacement de leur base.

Andy acquiesce, pusi demande: "De toute façon on allait les tuer, non ?"
</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>65</y>
                <center>
                  <x>144</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>65</yMin>
                <xMax>149</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>22</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Naturally.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="NextDialog">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>139</x>
                <y>109</y>
                <center>
                  <x>144</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>109</yMin>
                <xMax>149</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>24</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Laissez les vivre.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2298</x>
        <y>-594</y>
        <center>
          <x>2373</x>
          <y>-544</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>2298</xMin>
        <yMin>-594</yMin>
        <xMax>2448</xMax>
        <yMax>-494</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous parvenez à rattraper les Privateers en fuite et les expédier facilement dans l'autre monde.

[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>65</y>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>65</yMin>
                <xMax>148</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>23</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Excellent.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2521</x>
        <y>-622</y>
        <center>
          <x>2618</x>
          <y>-572</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2521</xMin>
        <yMin>-622</yMin>
        <xMax>2715</xMax>
        <yMax>-522</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy applaudit vos efforts..

"En route vers la bade des Privateers, O mon frère!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>Vous avez forcé certains Privateers à révéler l'emplacement de leur base, avant de les excécuter proprement.

En route pour leur base pour détruire le reste d'entre eux.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Onwards!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>2310</x>
        <y>-453</y>
        <center>
          <x>2407</x>
          <y>-403</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>2310</xMin>
        <yMin>-453</yMin>
        <xMax>2504</xMax>
        <yMax>-353</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy semble déçu.

Vous saisissez les coordonnées de la base des Privateers sur votre carte.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddObjectiveNode">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>182</x>
                <y>65</y>
                <center>
                  <x>187</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>65</yMin>
                <xMax>192</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <nodeName>Q_Hyperdrive_PrivateerBase2</nodeName>
              <nodeDiscription>Vous avez forcé certains Privateers à révéler l'emplacement de leur base et les avez laissé vivre.

En route pour leur base pour détruire les autres.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>En route!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_PrivateerStart2</Name>
</Scenario>