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
      <Text>You arrive at the village of Whiteborough, according to Andy this was the last place the squad of raiders was spotted.

The fact they've been here is evident from the carnage left behind.</Text>
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
          <Name>Head into town.</Name>
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
          <Name>Scan the surroundings.</Name>
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
      <Text>All of the raider vehicles have been destroyed.

[0loot]

Hopefully the victims of Whiteborough can find some peace now.

Andy looks grim.</Text>
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
          <Name>Are we done?</Name>
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
      <Text>You drive up the main road of Whiteborough.

Most of the buildings have been shot to hell, corpses litter the streets and the air smells putrid.

Andy scowls and mutters: "Damn bastards... they deserve to pay for this."</Text>
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
          <Name>Look for survivors.</Name>
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
          <Name>Search for tracks.</Name>
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
      <Text>As you prepare to drive up the main road, you are suddenly surrounded by several blood-stained vehicles.

It would appear the raiders never left!

Despite the surprise, you manage to manoeuvre in such a way that you don't suffer any disadvantages in the following combat.</Text>
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
          <Name>Prepare to fight!</Name>
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
      <Text>As you prepare to drive up the main road, you are suddenly surrounded by several blood-stained vehicles.

It would appear the raiders never left!

They open fire, damaging one of your vehicles before you have a chance to retalliate.</Text>
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
          <Name>Prepare to fight!</Name>
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
      <Text>You don't pick up any signals from other vehicles.

The raiders must be long gone.</Text>
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
          <Name>Head into town.</Name>
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
      <Text>The scanner picks up signals from a group of vehicles leaving this general area!

They could be the raiders you're looking for.</Text>
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
          <Name>After them!</Name>
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
          <Name>Radio them.</Name>
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
      <Text>As you start scanning the area, you pick up a variety of signals surrounding your position.

It would appear the raiders are still here, and they are attacking you right now!</Text>
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
          <Name>Prepare to fight!</Name>
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
      <Text>After your attempted contact, the vehicles appear to turn and approach your position.

"We don't talk with meat! Prepare to die!"

You wonder about the paradoxal nature of that statement, before priming your weapons.</Text>
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
          <Name>Fight!</Name>
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
      <Text>You chase after the raiders, who are easily overtaken.

They turn around to fight you.</Text>
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
          <Name>Ready weapons!</Name>
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
      <Text>As you chase after the presumed raiders, your scanner suddenly picks up a lot more signals surrounding you!

It turns out the raiders were baiting you right into an ambush, making the following combat significantly harder.
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
          <Name>Attack!</Name>
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
      <Text>Andy stops you, exclaiming: "No! These raiders are filthy pigs who do not deserve to be treated like human beings.

There shall be no conversation, only death!"</Text>
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
          <Name>Chase the raiders!</Name>
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
      <Text>You find a heavily wounded man, presumably left for dead.

Despite the best efforts of your medical bay, he succumbs to his wounds... but not before stammering: "They went.... east..."</Text>
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
              <nodeDiscription>You found a dying man in Whiteborough, who told you the direction the raiders went.

Chase after them to bring them to justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>After them!</Name>
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
      <Text>Despite your best efforts, you can't find any survivors. 

The raiders didn't leave any.
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

Andy looks thoughtful, then adds: "It can't be long... if we chase after them now, we're sure to catch up to them."</Text>
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
              <nodeDiscription>After investigating the tracks left behind in Whiteborough, you determined the raiders must be around this general area.

Chase after them to bring them to justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>Let's go!</Name>
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

"Hold up, do you hear that? Vehicles... they're still near."

You spot dust-clouds in the distance.</Text>
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
          <Name>After them!</Name>
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
        <xMin>683</xMin>
        <yMin>144</yMin>
        <xMax>877</xMax>
        <yMax>244</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You find a heavily wounded woman, presumably left for dead.

Despite the best efforts of your medical bay, she succumbs to his wounds... but not before stammering: "They went... that... way..."</Text>
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
              <nodeDiscription>You found a dying woman in Whiteborough, who told you the direction the raiders went.

Chase after them to bring them to justice.</nodeDiscription>
              <pos>Distance</pos>
              <distance>4</distance>
            </ButtonAction>
          </Actions>
          <Name>After them!</Name>
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
      <Text>"That we are, O my brother.

Whilst there is always more justice to be done, for now our hands are tied.

Return me to the Sasiak milkbar and I'll supply you with your desired Hyperdrive Stabilizers."</Text>
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
              <nodeDiscription>You have brought the raiders responsible for the carnage at Whiteborough to justice.

Andy has promised to give you the Hyperdrive Stabilizers after you've returned him to the Sasiak milkbar.</nodeDiscription>
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