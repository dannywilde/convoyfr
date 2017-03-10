<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_PrivateerBase2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>317</x>
        <y>-71</y>
        <center>
          <x>436</x>
          <y>42.5</y>
        </center>
        <width>238</width>
        <height>227</height>
        <xMin>317</xMin>
        <yMin>-71</yMin>
        <xMax>555</xMax>
        <yMax>156</yMax>
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
        <x>239</x>
        <y>599</y>
        <center>
          <x>314</x>
          <y>659.5</y>
        </center>
        <width>150</width>
        <height>121</height>
        <xMin>239</xMin>
        <yMin>599</yMin>
        <xMax>389</xMax>
        <yMax>720</yMax>
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
              <ToDialog>9</ToDialog>
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
        <x>635</x>
        <y>213</y>
        <center>
          <x>737.5</x>
          <y>304.5</y>
        </center>
        <width>205</width>
        <height>183</height>
        <xMin>635</xMin>
        <yMin>213</yMin>
        <xMax>840</xMax>
        <yMax>396</yMax>
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
        <x>700</x>
        <y>-330</y>
        <center>
          <x>775</x>
          <y>-280</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>700</xMin>
        <yMin>-330</yMin>
        <xMax>850</xMax>
        <yMax>-230</yMax>
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
        <x>804</x>
        <y>-189</y>
        <center>
          <x>915</x>
          <y>-139</y>
        </center>
        <width>222</width>
        <height>100</height>
        <xMin>804</xMin>
        <yMin>-189</yMin>
        <xMax>1026</xMax>
        <yMax>-89</yMax>
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
        <x>1104</x>
        <y>78</y>
        <center>
          <x>1179</x>
          <y>128</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1104</xMin>
        <yMin>78</yMin>
        <xMax>1254</xMax>
        <yMax>178</yMax>
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
        <x>1098</x>
        <y>260</y>
        <center>
          <x>1173</x>
          <y>310</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1098</xMin>
        <yMin>260</yMin>
        <xMax>1248</xMax>
        <yMax>360</yMax>
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
        <x>1083</x>
        <y>-151</y>
        <center>
          <x>1158</x>
          <y>-101</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1083</xMin>
        <yMin>-151</yMin>
        <xMax>1233</xMax>
        <yMax>-51</yMax>
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
        <x>1350</x>
        <y>48</y>
        <center>
          <x>1425</x>
          <y>98</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1350</xMin>
        <yMin>48</yMin>
        <xMax>1500</xMax>
        <yMax>148</yMax>
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
        <x>589</x>
        <y>638</y>
        <center>
          <x>686</x>
          <y>688</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>589</xMin>
        <yMin>638</yMin>
        <xMax>783</xMax>
        <yMax>738</yMax>
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
  </Dialogs>
  <Name>Q_Hyperdrive_PrivateerBase2</Name>
</Scenario>