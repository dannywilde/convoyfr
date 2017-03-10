<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_Tracking.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-665</x>
        <y>151</y>
        <center>
          <x>-546</x>
          <y>264.5</y>
        </center>
        <width>238</width>
        <height>227</height>
        <xMin>-665</xMin>
        <yMin>151</yMin>
        <xMax>-427</xMax>
        <yMax>378</yMax>
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
              <ToDialog>17</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Next...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>134</x>
        <y>769</y>
        <center>
          <x>209</x>
          <y>829.5</y>
        </center>
        <width>150</width>
        <height>121</height>
        <xMin>134</xMin>
        <yMin>769</yMin>
        <xMax>284</xMax>
        <yMax>890</yMax>
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
          <Name>Sommes-nous faits ?</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>530</x>
        <y>383</y>
        <center>
          <x>632.5</x>
          <y>474.5</y>
        </center>
        <width>205</width>
        <height>183</height>
        <xMin>530</xMin>
        <yMin>383</yMin>
        <xMax>735</xMax>
        <yMax>566</yMax>
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
        <x>595</x>
        <y>-160</y>
        <center>
          <x>670</x>
          <y>-110</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>595</xMin>
        <yMin>-160</yMin>
        <xMax>745</xMax>
        <yMax>-60</yMax>
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
        <x>699</x>
        <y>-19</y>
        <center>
          <x>810</x>
          <y>31</y>
        </center>
        <width>222</width>
        <height>100</height>
        <xMin>699</xMin>
        <yMin>-19</yMin>
        <xMax>921</xMax>
        <yMax>81</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous vous précipitez dans la base des privateers et commencer à tirer.

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
        <x>999</x>
        <y>248</y>
        <center>
          <x>1074</x>
          <y>298</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>999</xMin>
        <yMin>248</yMin>
        <xMax>1149</xMax>
        <yMax>348</yMax>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>993</x>
        <y>430</y>
        <center>
          <x>1068</x>
          <y>480</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>993</xMin>
        <yMin>430</yMin>
        <xMax>1143</xMax>
        <yMax>530</yMax>
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
        <x>978</x>
        <y>19</y>
        <center>
          <x>1053</x>
          <y>69</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>978</xMin>
        <yMin>19</yMin>
        <xMax>1128</xMax>
        <yMax>119</yMax>
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
        <x>1245</x>
        <y>218</y>
        <center>
          <x>1320</x>
          <y>268</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1245</xMin>
        <yMin>218</yMin>
        <xMax>1395</xMax>
        <yMax>318</yMax>
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
        <x>484</x>
        <y>808</y>
        <center>
          <x>581</x>
          <y>858</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>484</xMin>
        <yMin>808</yMin>
        <xMax>678</xMax>
        <yMax>908</yMax>
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
          <Name>Let's go.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>392</x>
        <y>666</y>
        <center>
          <x>489</x>
          <y>716</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>392</xMin>
        <yMin>666</yMin>
        <xMax>586</xMax>
        <yMax>766</yMax>
      </GraphRect>
      <Name>Nouvequ Diqlogue</Name>
      <Text>"J'ai bien peur que non, mon frère.

C'est une zone de contrôle T.O.R.V.A.K. pas loin d'ici qui a subit quelques problèmes.

Il semblerait qu'ils font des expériences sur la population locale, ce qui n'est pas forcément une nouveauté ... leur dernière victime a rendu les choses plus personnelles.

Je ne vais pas entrer dans beaucoup plus de détails, mais j'ai besoin de le libérer."</Text>
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
              <nodeDiscription>Malgré l'élimination de la base des privateers Andy n'est pas encore satisfait.

Il veut que vous fassiez une enquête sur un Point de contrôle T.O.R.V.A.K. et le sauvetage d'un civil capturé.</nodeDiscription>
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
        <x>391</x>
        <y>941</y>
        <center>
          <x>488</x>
          <y>991</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>391</xMin>
        <yMin>941</yMin>
        <xMax>585</xMax>
        <yMax>1041</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"J'en ai bien peur, mon frère.

Il y a une escouade de raiders hurlant sur les chansons paillardes de leurs pères et allant se saouler entre eux à la façon d'un vieil orgueilleux baignant dans sa crasse et ses tripes putréfiées.

Les derniers renseignements que j'ai sur eux font rapport d'un pillage du village de Whiteborough.

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
              <nodeDiscription>Malgré l'élimination de la base des privateers Andy n'est pas encore satisfait.

Il veut que vous trouviez une équipe de raiders qui avaient été vus pour la dernière fois dans le village de Whiteborough.</nodeDiscription>
              <pos>Random</pos>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>Very well...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>251</x>
        <y>139</y>
        <center>
          <x>353.5</x>
          <y>252.5</y>
        </center>
        <width>205</width>
        <height>227</height>
        <xMin>251</xMin>
        <yMin>139</yMin>
        <xMax>456</xMax>
        <yMax>366</yMax>
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
        <x>-212</x>
        <y>63</y>
        <center>
          <x>-115</x>
          <y>113</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>-212</xMin>
        <yMin>63</yMin>
        <xMax>-18</xMax>
        <yMax>163</yMax>
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
              <nodeName>Q_Hyperdrive_Tracking</nodeName>
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
        <x>-216</x>
        <y>533</y>
        <center>
          <x>-119</x>
          <y>583</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>-216</xMin>
        <yMin>533</yMin>
        <xMax>-22</xMax>
        <yMax>633</yMax>
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
              <nodeName>Q_Hyperdrive_Tracking</nodeName>
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
        <x>-210</x>
        <y>386</y>
        <center>
          <x>-113</x>
          <y>436</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>-210</xMin>
        <yMin>386</yMin>
        <xMax>-16</xMax>
        <yMax>486</yMax>
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
              <nodeName>Q_Hyperdrive_Tracking</nodeName>
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
        <x>-210</x>
        <y>252</y>
        <center>
          <x>-113</x>
          <y>302</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>-210</xMin>
        <yMin>252</yMin>
        <xMax>-16</xMax>
        <yMax>352</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Les véhicules privateers s'arrêtent brusquement!

Vous paniquez légèrement, mais il s'avère l'un des privateers devait faire un arrêt nécessaire pour tenir compte de l'appel de la nature.

Après quoi, ils se préparent à repartir une fois de plus.</Text>
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
              <nodeName>Q_Hyperdrive_Tracking</nodeName>
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
        <x>-220</x>
        <y>675</y>
        <center>
          <x>-123</x>
          <y>725</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>-220</xMin>
        <yMin>675</yMin>
        <xMax>-26</xMax>
        <yMax>775</yMax>
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
              <nodeName>Q_Hyperdrive_Tracking</nodeName>
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
  <Name>Q_Hyperdrive_Tracking</Name>
</Scenario>