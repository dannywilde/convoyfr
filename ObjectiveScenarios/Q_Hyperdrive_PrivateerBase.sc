<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_PrivateerBase.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>274</x>
        <y>-114</y>
        <center>
          <x>393</x>
          <y>-0.5</y>
        </center>
        <width>238</width>
        <height>227</height>
        <xMin>274</xMin>
        <yMin>-114</yMin>
        <xMax>512</xMax>
        <yMax>113</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Vous arrivez à la base privateer.

Andy sourit largement. "Randons la justice comme jamais!"</Text>
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
              <Chance>2</Chance>
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
              <Chance>4</Chance>
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
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>190</AmountAP>
              <AmountHP>210</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Attaquer!</Name>
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
                <x>226</x>
                <y>145</y>
                <center>
                  <x>231</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>145</yMin>
                <xMax>236</xMax>
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
                <x>226</x>
                <y>163</y>
                <center>
                  <x>231</x>
                  <y>168</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>163</yMin>
                <xMax>236</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Essayer de les attirer dans une embuscade.</Name>
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
                <x>226</x>
                <y>207</y>
                <center>
                  <x>231</x>
                  <y>212</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>226</xMin>
                <yMin>207</yMin>
                <xMax>236</xMax>
                <yMax>217</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Les contacter par radio.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>196</x>
        <y>556</y>
        <center>
          <x>271</x>
          <y>616.5</y>
        </center>
        <width>150</width>
        <height>121</height>
        <xMin>196</xMin>
        <yMin>556</yMin>
        <xMax>346</xMax>
        <yMax>677</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Avec le dernier véhicule privateer détruit, il est facile d'aplatir la base elle-même.

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
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>83</y>
                <center>
                  <x>143</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>83</yMin>
                <xMax>148</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>101</y>
                <center>
                  <x>143</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>138</xMin>
                <yMin>101</yMin>
                <xMax>148</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>11</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>On a fini ?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>592</x>
        <y>170</y>
        <center>
          <x>694.5</x>
          <y>261.5</y>
        </center>
        <width>205</width>
        <height>183</height>
        <xMin>592</xMin>
        <yMin>170</yMin>
        <xMax>797</xMax>
        <yMax>353</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy retiens votre main alors que vous alliez atteindre la radio.

"Ils doivent être éliminés. Il n'y a pas de diplomatie."</Text>
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
          <Name>Attaquer!</Name>
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
          <Name>Les prendre dans une ambuscade.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>657</x>
        <y>-373</y>
        <center>
          <x>732</x>
          <y>-323</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>657</xMin>
        <yMin>-373</yMin>
        <xMax>807</xMax>
        <yMax>-273</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous attrapez la base de raider par surprise, vous donnant un avantage significatif dans le combat suivant.
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
        <x>761</x>
        <y>-232</y>
        <center>
          <x>872</x>
          <y>-182</y>
        </center>
        <width>222</width>
        <height>100</height>
        <xMin>761</xMin>
        <yMin>-232</yMin>
        <xMax>983</xMax>
        <yMax>-132</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous précipitez dans la base privateer et commencer à tirer.

Bien que courageux, et certainement digne de respect d'Andy, cela ne vous donne pas un avantage dans le combat suivant.</Text>
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
          <Name>Pas besoin de ça, FEUUUUUU!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1061</x>
        <y>35</y>
        <center>
          <x>1136</x>
          <y>85</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1061</xMin>
        <yMin>35</yMin>
        <xMax>1211</xMax>
        <yMax>135</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous cachez en embuscade et envoyez un seul véhicule pour attirer les privateers vers vous.

Ils tombent dans le panneau exactement comme prévu, vous dynamitez beaucoup de leurs véhicules offensifs sans qu'ils aient une chance de se répondre à vos attaques.

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
          <Name>Génial!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1055</x>
        <y>217</y>
        <center>
          <x>1130</x>
          <y>267</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1055</xMin>
        <yMin>217</yMin>
        <xMax>1205</xMax>
        <yMax>317</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous cachez en embuscade et envoyez un seul véhicule pour attirer les privateers vers vous.

Ils doivent déjà avoir détecté votre présence, il ne se font pas avoir.

Vous devrez assaillir la base.
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
          <Name>En avant!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1040</x>
        <y>-194</y>
        <center>
          <x>1115</x>
          <y>-144</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1040</xMin>
        <yMin>-194</yMin>
        <xMax>1190</xMax>
        <yMax>-94</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous précipitez dans la base privateer et commencez à tirer.

Bien que courageux, et certainement digne du respect d'Andy, cela vous a laissé assez vulnérable pour le feu ennemi, un de vos véhicules est endommagé.</Text>
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
          <Name>Attaquer!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1307</x>
        <y>5</y>
        <center>
          <x>1382</x>
          <y>55</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1307</xMin>
        <yMin>5</yMin>
        <xMax>1457</xMax>
        <yMax>105</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous préparez à détruire les autres véhicules privateers.
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
          <Name>Né pour ça!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>546</x>
        <y>595</y>
        <center>
          <x>643</x>
          <y>645</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>546</xMin>
        <yMin>595</yMin>
        <xMax>740</xMax>
        <yMax>695</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Ce que nous sommes, Ô mon frère.

Revenons au bar à lait Sasiak, alors je vous obtiendrai votre Hyperdrive Stabilizer."
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
              <nodeDiscription>La soif de violence d'Andy a été satisfaite. 

Il vous a demandé de le ramener au bar à lait Sasiak afin que vous puissiez obtenir l'Hyperdrive Stabilizers.</nodeDiscription>
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
        <x>454</x>
        <y>453</y>
        <center>
          <x>551</x>
          <y>503</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>454</xMin>
        <yMin>453</yMin>
        <xMax>648</xMax>
        <yMax>553</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Malheureusement non, mon frère.

Il y a un point de contrôle T.O.R.V.A.K. pas trop loin d'ici qui a une fonction qui me dérange.

Il semblerait qu'ils font des expériences sur la population locale, ça ce n'est pas forcément une nouvelle ... par contre leur dernière victime a rendu les choses plus personnelles.

Je ne vais pas entrer plus dans les détails, mais j'ai besoin de la libérer."</Text>
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
              <nodeName>Q_Hyperdrive_TorvakStart2</nodeName>
              <nodeDiscription>Malgré l'élimination de la base privateer, Andy n'est pas encore satisfait.

Il veut que vous fassiez une enquête sur un point de contrôle T.O.R.V.A.K. et le sauvetage d'un civil capturé.</nodeDiscription>
              <pos>Distance</pos>
              <distance>9</distance>
            </ButtonAction>
          </Actions>
          <Name>Très bien...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>453</x>
        <y>728</y>
        <center>
          <x>550</x>
          <y>778</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>453</xMin>
        <yMin>728</yMin>
        <xMax>647</xMax>
        <yMax>828</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Malheureusement non, mon frère.

Il y a une escouade de raiders hurlant sur les chansons paillardes de leurs pères et allant se saouler dans le milieu à la façon d'un vieil assassin dans sa puanteur, les tripes putréfiées.

La dernière information que j'ai sur eux est leur pillage du village de Whiteborough.

En avant! Enquêtons!"</Text>
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
              <nodeName>Q_Hyperdrive_RaiderStart2</nodeName>
              <nodeDiscription>Malgré l'élimination de la base privateer, Andy n'est pas encore satisfait.

Il veut que vous trouviez une équipe de raiders qui avaient été vus pour la dernière fois dans le village de Whiteborough.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Très bien...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_PrivateerBase</Name>
</Scenario>