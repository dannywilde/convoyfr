<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_Hyperdrive_RaiderStart2.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-237</x>
        <y>582</y>
        <center>
          <x>-134.5</x>
          <y>682.5</y>
        </center>
        <width>205</width>
        <height>201</height>
        <xMin>-237</xMin>
        <yMin>582</yMin>
        <xMax>-32</xMax>
        <yMax>783</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Vous arrivez au village de Whiteborough, selon Andy, c'était le dernier endroit où l'escouade de raiders a été repéré.

Le fait qu'ils ont été ici est évident au vu du carnage laissé derrière eux.</Text>
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
              <ToDialog>2</ToDialog>
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
              <ToDialog>3</ToDialog>
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
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>260</AmountAP>
              <AmountHP>230</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Entrez en ville.</Name>
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
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>181</y>
                <center>
                  <x>198</x>
                  <y>186</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>181</yMin>
                <xMax>203</xMax>
                <yMax>191</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Scruter les alentours.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-339</x>
        <y>1560</y>
        <center>
          <x>-264</x>
          <y>1620.5</y>
        </center>
        <width>150</width>
        <height>121</height>
        <xMin>-339</xMin>
        <yMin>1560</yMin>
        <xMax>-189</xMax>
        <yMax>1681</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>Tous les véhicules de raiders ont été détruits.

[0loot]

Espérons que les victimes de Whiteborough pourront à présent profiter de la paix retrouvée.

Andy semble triste.</Text>
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
              <ToDialog>17</ToDialog>
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
        <x>422</x>
        <y>404</y>
        <center>
          <x>500.5</x>
          <y>495.5</y>
        </center>
        <width>157</width>
        <height>183</height>
        <xMin>422</xMin>
        <yMin>404</yMin>
        <xMax>579</xMax>
        <yMax>587</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous remontez la route principale de Whiteborough.

La plupart des bâtiments ont été détruits, des cadavres jonchent les rues et l'air a des odeurs putrides.

Andy fronça les sourcils et murmure: "Putains de bâtards ... ils méritent de payer pour ça."</Text>
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
                <x>145</x>
                <y>65</y>
                <center>
                  <x>150</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>145</xMin>
                <yMin>65</yMin>
                <xMax>155</xMax>
                <yMax>75</yMax>
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
                <x>145</x>
                <y>83</y>
                <center>
                  <x>150</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>145</xMin>
                <yMin>83</yMin>
                <xMax>155</xMax>
                <yMax>93</yMax>
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
                <x>145</x>
                <y>101</y>
                <center>
                  <x>150</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>145</xMin>
                <yMin>101</yMin>
                <xMax>155</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>13</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Rechercher des survivants.</Name>
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
                <x>145</x>
                <y>145</y>
                <center>
                  <x>150</x>
                  <y>150</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>145</xMin>
                <yMin>145</yMin>
                <xMax>155</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>2</Chance>
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
                <x>145</x>
                <y>163</y>
                <center>
                  <x>150</x>
                  <y>168</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>145</xMin>
                <yMin>163</yMin>
                <xMax>155</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Recherches de pistes.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>172</x>
        <y>566</y>
        <center>
          <x>247</x>
          <y>616</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>172</xMin>
        <yMin>566</yMin>
        <xMax>322</xMax>
        <yMax>666</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Lorsque vous vous préparez à conduire sur la route principale, vous êtes soudain entouré de plusieurs véhicules maculés de sang.

Il semblerait que les raiders ne soient jamais partis!

Malgré la surprise, vous parvenez à manœuvrer de telle manière de ne pas être à votre désaventage dans le combat suivant.</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Preparez vous au combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>166</x>
        <y>679</y>
        <center>
          <x>241</x>
          <y>729</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>166</xMin>
        <yMin>679</yMin>
        <xMax>316</xMax>
        <yMax>779</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Lorsque vous vous préparez à conduire sur la route principale, vous êtes soudain entouré de plusieurs véhicules maculés de sang.

Il semblerait que les raiders ne soient jamais partis!

Ils ouvrent le feu, endommageant un de vos véhicules avant que vous ayez une chance de retraite..</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Préparez vous au combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>170</x>
        <y>830</y>
        <center>
          <x>245.5</x>
          <y>880</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>170</xMin>
        <yMin>830</yMin>
        <xMax>321</xMax>
        <yMax>930</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous ne captez pas les signaux d'autres véhicules.

Les raiders ont du partir depuis longtemps.</Text>
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
          <Name>Entrez en ville.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>164</x>
        <y>955</y>
        <center>
          <x>266.5</x>
          <y>1037.5</y>
        </center>
        <width>205</width>
        <height>165</height>
        <xMin>164</xMin>
        <yMin>955</yMin>
        <xMax>369</xMax>
        <yMax>1120</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Le scanner récupère les signaux d'un groupe de véhicules quittant cette zone!

Ils pourraient être les raiders que vous recherchez.</Text>
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
              <ToDialog>9</ToDialog>
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
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>0</AmountAP>
              <AmountHP>0</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>A leur poursuite!</Name>
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
                <y>127</y>
                <center>
                  <x>198</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>193</xMin>
                <yMin>127</yMin>
                <xMax>203</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>8</ToDialog>
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
              <ToDialog>11</ToDialog>
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
        <x>150</x>
        <y>1171</y>
        <center>
          <x>252.5</x>
          <y>1221</y>
        </center>
        <width>205</width>
        <height>100</height>
        <xMin>150</xMin>
        <yMin>1171</yMin>
        <xMax>355</xMax>
        <yMax>1271</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Lorsque vous commencez à scanner la zone, vous captez une variété de signaux entourant votre position.

Il semblerait que les raiders soient toujours là, et ils vous attaquent maintenant!</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>1</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Préparez vous au combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>504</x>
        <y>979</y>
        <center>
          <x>579</x>
          <y>1029</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>504</xMin>
        <yMin>979</yMin>
        <xMax>654</xMax>
        <yMax>1079</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Après votre tentative de contact, les véhicules semblent tourner et s'approcher de votre position.

«Nous ne parlons pas avec de la viande, préparez-vous à mourir!

Vous vous interrogez sur le caractère paradoxal de cette déclaration, avant de charger vos armes.</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Combat!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>715</x>
        <y>750</y>
        <center>
          <x>790</x>
          <y>800</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>715</xMin>
        <yMin>750</yMin>
        <xMax>865</xMax>
        <yMax>850</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous poursuivez les raiders, qui sont facilement rattrappés.

Ils vous font face pour combattre.</Text>
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
              <enemyType>Raiders</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Armes prêtes!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>919</x>
        <y>817</y>
        <center>
          <x>994</x>
          <y>867</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>919</xMin>
        <yMin>817</yMin>
        <xMax>1069</xMax>
        <yMax>917</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Pendant que vous poursuivez les raiders présumés, votre scanner affiche soudainement beaucoup plus de signaux qui vous entourent!

Il s'avère que les raiders ont servi d'appât pour vous amener droit dans une embuscade, rendant le combat suivant considérablement plus difficile.
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
              <enemyType>Raiders</enemyType>
              <difficulty>2</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Attaquer!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>513</x>
        <y>1099</y>
        <center>
          <x>590.5</x>
          <y>1150.5</y>
        </center>
        <width>155</width>
        <height>103</height>
        <xMin>513</xMin>
        <yMin>1099</yMin>
        <xMax>668</xMax>
        <yMax>1202</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Andy vous arrête, en criant: «Non, ces raiders sont des salauds qui ne méritent pas d'être traités comme des êtres humains.

Il n'y aura pas de conversation, seulement la mort!"</Text>
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
                <x>143</x>
                <y>65</y>
                <center>
                  <x>148</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>143</xMin>
                <yMin>65</yMin>
                <xMax>153</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>9</ToDialog>
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
                <x>143</x>
                <y>83</y>
                <center>
                  <x>148</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>143</xMin>
                <yMin>83</yMin>
                <xMax>153</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Poursuivez les raiders!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>652</x>
        <y>5</y>
        <center>
          <x>749</x>
          <y>55</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>652</xMin>
        <yMin>5</yMin>
        <xMax>846</xMax>
        <yMax>105</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous trouvez un homme gravement blessé, vraisemblablement laissé pour mort.

Malgré les meilleurs efforts de votre équipe médicale, il succombe à ses blessures ... mais pas avant d'avoir balbutié: «Ils sont allés ... à l'est ..."</Text>
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
              <nodeName>Q_Hyperdrive_RaiderChase2</nodeName>
              <nodeDiscription>Vous avez trouvé un homme mourant à Whiteborough, qui vous a dit la direction des raiders.

Poursuivez-les pour les traduire en justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>A leur poursuite!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>699</x>
        <y>304</y>
        <center>
          <x>775</x>
          <y>355.5</y>
        </center>
        <width>152</width>
        <height>103</height>
        <xMin>699</xMin>
        <yMin>304</yMin>
        <xMax>851</xMax>
        <yMax>407</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Malgré tous vos efforts, vous ne trouvez pas de survivants.

Les raiders n'ont laissé personne.
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
                <x>140</x>
                <y>65</y>
                <center>
                  <x>145</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>140</xMin>
                <yMin>65</yMin>
                <xMax>150</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
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
                <x>140</x>
                <y>83</y>
                <center>
                  <x>145</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>140</xMin>
                <yMin>83</yMin>
                <xMax>150</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>15</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Search for tracks.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>956</x>
        <y>413</y>
        <center>
          <x>1053</x>
          <y>463</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>956</xMin>
        <yMin>413</yMin>
        <xMax>1150</xMax>
        <yMax>513</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After considering the tracks left behind, it seems apparent where the raiders went.

Andy regarde pensif, puis ajoute: "Il ne peuvent pas être loin ... si nous les poursuivons maintenant, nous sommes sûrs de les rattraper."</Text>
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
              <nodeName>Q_Hyperdrive_RaiderChase2</nodeName>
              <nodeDiscription>Après avoir enquêté sur les traces laissées à Whiteborough, vous avez déterminé que les raiders doivent être autour de cette zone.

Poursuivez-les pour les traduire en justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>En route!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>790</x>
        <y>551</y>
        <center>
          <x>865.5</x>
          <y>602.5</y>
        </center>
        <width>151</width>
        <height>103</height>
        <xMin>790</xMin>
        <yMin>551</yMin>
        <xMax>941</xMax>
        <yMax>654</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you prepare to search for tracks, Andy puts his hand on your shoulder and says:

«Tenez, entendez-vous ça? Les véhicules ... ils sont tout proche.

Vous apercevez des nuages de poussière au loin.</Text>
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
              <Chance>3</Chance>
              <ToDialog>9</ToDialog>
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
                <x>139</x>
                <y>83</y>
                <center>
                  <x>144</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>139</xMin>
                <yMin>83</yMin>
                <xMax>149</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>10</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>A leur poursuite!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>683</x>
        <y>144</y>
        <center>
          <x>780</x>
          <y>194</y>
        </center>
        <width>194</width>
        <height>100</height>
        <size>
          <x>194</x>
          <y>100</y>
        </size>
        <xMin>180</xMin>
        <yMin>-218</yMin>
        <xMax>374</xMax>
        <yMax>-118</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Vous trouvez une femme gravement blessée, vraisemblablement laissée pour mort.

En dépit des meilleurs efforts de votre équipe médicale, elle succombe à ses blessures ... mais pas avant d'avoir balbutié en vous montrant une direction du doigt: "Ils sont allés ... ce ... chemin ..."</Text>
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
              <nodeName>Q_Hyperdrive_RaiderChase2</nodeName>
              <nodeDiscription>Vous avez trouvé une femme mourante à Whiteborough, qui vous a dit la direction prise par les raiders.

Poursuivez-les pour les traduire en justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>A leur poursuite!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>6</x>
        <y>1534</y>
        <center>
          <x>103</x>
          <y>1584</y>
        </center>
        <width>194</width>
        <height>100</height>
        <xMin>6</xMin>
        <yMin>1534</yMin>
        <xMax>200</xMax>
        <yMax>1634</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>C'est ce que nous sommes, Ô mon frère.

Bien qu'il y ai toujours plus de justice à rétablir, pour l'instant nos mains sont liées.

Ramenez-moi au bar à lait Sasiak et je vous fournirai votre précieux Hyperdrive Stabilizers."</Text>
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
              <nodeDiscription>Vous avez amené les raiders responsables du massacre de Whiteborough devant la justice.

Andy a promis de vous donner les Stabilisateurs Hyperdrive dès que vous l'aurez ramené au bar à lait Sasiak.</nodeDiscription>
              <pos>SameAs</pos>
              <posSameAs>Q_M_S_Hyperdrive</posSameAs>
              <distance>0</distance>
            </ButtonAction>
          </Actions>
          <Name>To the milkbar!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_Hyperdrive_RaiderStart2</Name>
</Scenario>
