<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_Tracking2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>58</x>
        <y>467</y>
        <center>
          <x>177</x>
          <y>580.5</y>
        </center>
        <width>238</width>
        <height>227</height>
        <xMin>58</xMin>
        <yMin>467</yMin>
        <xMax>296</xMax>
        <yMax>694</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Vous êtes à la poursuite des véhicules des privateers.</Text>
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
                <x>226</x>
                <y>65</y>
                <center>
                  <x>231</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>65</yMin>
                <xMax>236</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
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
                <x>226</x>
                <y>83</y>
                <center>
                  <x>231</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>83</yMin>
                <xMax>236</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>7</Chance>
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
                <x>226</x>
                <y>101</y>
                <center>
                  <x>231</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>101</yMin>
                <xMax>236</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>14</ToDialog>
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
                <x>226</x>
                <y>119</y>
                <center>
                  <x>231</x>
                  <y>124</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>119</yMin>
                <xMax>236</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
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
                <x>226</x>
                <y>137</y>
                <center>
                  <x>231</x>
                  <y>142</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>137</yMin>
                <xMax>236</xMax>
                <yMax>147</yMax>
              </ButtonRect>
              <Chance>1</Chance>
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
                <x>226</x>
                <y>155</y>
                <center>
                  <x>231</x>
                  <y>160</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>155</yMin>
                <xMax>236</xMax>
                <yMax>165</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Suivant...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>857</x>
        <y>1085</y>
        <center>
          <x>932</x>
          <y>1145.5</y>
        </center>
        <width>150</width>
        <height>121</height>
        <xMin>857</xMin>
        <yMin>1085</yMin>
        <xMax>1007</xMax>
        <yMax>1206</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Avec le dernier véhicule privatter détruit, il est facile d'aplatir la base elle-même..

[0loot]

Andy applaudit sincèrement vos efforts.
</Text>
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
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Sommes-nous faits ?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1253</x>
        <y>699</y>
        <center>
          <x>1355.5</x>
          <y>790.5</y>
        </center>
        <width>205</width>
        <height>183</height>
        <xMin>1253</xMin>
        <yMin>699</yMin>
        <xMax>1458</xMax>
        <yMax>882</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy bloque votre main alors que vous atteignez la radio.

"Ils doivent être éliminés. Il n'y a pas de diplomatie.."</Text>
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
                <x>193</x>
                <y>65</y>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
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
                <x>193</x>
                <y>83</y>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>101</y>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>90</AmountAP>
              <AmountHP>110</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Attaquez!</Name>
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
                <x>193</x>
                <y>145</y>
                <center>
                  <x>198</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>145</yMin>
                <xMax>203</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>5</ToDialog>
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
                <x>193</x>
                <y>163</y>
                <center>
                  <x>198</x>
                  <y>168</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>163</yMin>
                <xMax>203</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Embustez-les.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1318</x>
        <y>156</y>
        <center>
          <x>1393</x>
          <y>206</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1318</xMin>
        <yMin>156</yMin>
        <xMax>1468</xMax>
        <yMax>256</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous attraquez la base des raiders par surprise, vous donnant un avantage significatif dans le combat suivant.
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
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Excellent!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1422</x>
        <y>297</y>
        <center>
          <x>1533</x>
          <y>347</y>
        </center>
        <width>222</width>
        <height>100</height>
        <xMin>1422</xMin>
        <yMin>297</yMin>
        <xMax>1644</xMax>
        <yMax>397</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous précipitez dans la base des privateers et commencer à tirer..

Bien que courageux, et certainement digne du respect d'Andy, cela ne vous donne pas un avantage pour le combat suivant..</Text>
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
          <Name>On a pas besoin de ça, FEUUUUUU !</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1722</x>
        <y>564</y>
        <center>
          <x>1797</x>
          <y>614</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1722</xMin>
        <yMin>564</yMin>
        <xMax>1872</xMax>
        <yMax>664</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous cachez en embuscade et envoyez un seul véhicule pour attirer les privateers vers vous.

Ils tombent dans le panneau exactement comme prévu, ce qui se traduit par vous dynamitant beaucoup de leurs véhicules offensifs avant qu'il aient une chance de se battre.

Cela devrait faciliter l'assaut de la base.

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
              <ToDialog>8</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Extra!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1716</x>
        <y>746</y>
        <center>
          <x>1791</x>
          <y>796</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1716</xMin>
        <yMin>746</yMin>
        <xMax>1866</xMax>
        <yMax>846</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous cachez en embuscade et envoyez un seul véhicule pour attirer les privateers vers vous.

Ils doivent déjà avoir détecté votre présence, comme ils ne semblent pas tomber dans le piège.

Vous devrez attaquer la base..
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
          <Name>Faisons le!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1701</x>
        <y>335</y>
        <center>
          <x>1776</x>
          <y>385</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1701</xMin>
        <yMin>335</yMin>
        <xMax>1851</xMax>
        <yMax>435</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous précipitez dans la base des privateers et commencer à tirer.

Bien que courageux, et certainement digne du respect d'Andy, il vous a laissé assez vulnérable pour le feu ennemi, résultat, un de vos véhicules à été endommagé..</Text>
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
          <Name>Attaque!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1968</x>
        <y>534</y>
        <center>
          <x>2043</x>
          <y>584</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1968</xMin>
        <yMin>534</yMin>
        <xMax>2118</xMax>
        <yMax>634</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous être prêt pour éliminer les véhicules privateers restants.
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
              <difficulty>-1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Vous êtes plus que prêt!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1207</x>
        <y>1124</y>
        <center>
          <x>1304</x>
          <y>1174</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>1207</xMin>
        <yMin>1124</yMin>
        <xMax>1401</xMax>
        <yMax>1224</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"C'est ce que nous sommes, ô mon frère.

Revenons au bar à lait Sasiak, je vais vous obtenir votre stabilisateur Hyperdrive."
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
              <nodeName>Q_Hyperdrive_Reward</nodeName>
              <nodeDiscription>La soif de violence d'Andy a été satisfaite.. 

Il vous a demandé de le ramener au bar à lait de Sasiak afin que vous puissiez obtenir le Stabilisateur Hyperdrive.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Hyperdrive</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>En route.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>974</x>
        <y>455</y>
        <center>
          <x>1076.5</x>
          <y>568.5</y>
        </center>
        <width>205</width>
        <height>227</height>
        <xMin>974</xMin>
        <yMin>455</yMin>
        <xMax>1179</xMax>
        <yMax>682</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Pendant que vous poursuivez les privateers, vos scanners finissent par détecter une activité accrue dans la région.

On dirait que vous avez trouvé la base des corsaires!

Andy semble content, puis se retourne et demande quel est le plan.</Text>
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
                <x>193</x>
                <y>65</y>
                <center>
                  <x>198</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>65</yMin>
                <xMax>203</xMax>
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
                <x>193</x>
                <y>83</y>
                <center>
                  <x>198</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>83</yMin>
                <xMax>203</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>101</y>
                <center>
                  <x>198</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>101</yMin>
                <xMax>203</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>190</AmountAP>
              <AmountHP>210</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Attaquez les!</Name>
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
                <x>193</x>
                <y>145</y>
                <center>
                  <x>198</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>145</yMin>
                <xMax>203</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
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
                <x>193</x>
                <y>163</y>
                <center>
                  <x>198</x>
                  <y>168</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>163</yMin>
                <xMax>203</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Les attirer dans une embuscade.</Name>
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
                <x>193</x>
                <y>207</y>
                <center>
                  <x>198</x>
                  <y>212</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>207</yMin>
                <xMax>203</xMax>
                <yMax>217</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Les contacter par Radio.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>511</x>
        <y>379</y>
        <center>
          <x>608</x>
          <y>429</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>511</xMin>
        <yMin>379</yMin>
        <xMax>705</xMax>
        <yMax>479</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vos scanners ne détectent pas de base dans le voisinage.

Cela ne peut pas durer bien longtemps.</Text>
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
              <nodeDiscription>Vous êtes à la poursuite des privateers, continuez à les suivre pour trouver leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Sûrement...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>507</x>
        <y>849</y>
        <center>
          <x>604</x>
          <y>899</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>507</xMin>
        <yMin>849</yMin>
        <xMax>701</xMax>
        <yMax>949</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Les véhicules privateers accélèrent soudainement.

Vous n'êtes pas sûr de ce que cela indique.</Text>
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
              <nodeDiscription>Vous êtes à la poursuite des privateers, continuez à les suivre pour trouver leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Continuez la poursuite!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>513</x>
        <y>702</y>
        <center>
          <x>610</x>
          <y>752</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>513</xMin>
        <yMin>702</yMin>
        <xMax>707</xMax>
        <yMax>802</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Pour un bref instant, vous perdez de vue les véhicules des privateers.

Andy souligne leur position présumée sur le scanner, ce qui s'avère être correct.

La poursuite continue.</Text>
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
              <nodeDiscription>Vous êtes à la poursuite des privateers, continuez à les suivre pour trouver leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Extra!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>513</x>
        <y>568</y>
        <center>
          <x>610</x>
          <y>618</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>513</xMin>
        <yMin>568</yMin>
        <xMax>707</xMax>
        <yMax>668</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Les véhicules privateers s'arrêtent brusquement!

Vous paniquez légèrement, mais il s'avère l'un des privateers devait faire un arrêt nécessaire pour tenir compte de l'appel de la nature.

APrès quoi, ils se préparent à repartir une fois de plus.</Text>
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
              <nodeDiscription>Vous êtes à la poursuite des privateers, continuez à les suivre pour trouver leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>La poursuite continue !</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>503</x>
        <y>991</y>
        <center>
          <x>600</x>
          <y>1041</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>503</xMin>
        <yMin>991</yMin>
        <xMax>697</xMax>
        <yMax>1091</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy semble pensif.

"Cela ne prendra sûrement plus beaucoup de temps maintenant ..."</Text>
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
              <nodeDiscription>Vous êtes à la poursuite des privateers, continuez à les suivre pour trouver leur base.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Esperons-le...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_Tracking2</Name>
</Scenario>