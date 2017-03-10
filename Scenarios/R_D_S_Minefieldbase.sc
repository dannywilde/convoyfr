<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <scenarioType>Radio</scenarioType>
  <FilePath>D:/Convoy/Assets/Scenarios/W_D_R_Minefieldbase.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-611</x>
        <y>289</y>
        <center>
          <x>-420.5</x>
          <y>364.699219</y>
        </center>
        <width>381</width>
        <height>151.398438</height>
        <xMin>-611</xMin>
        <yMin>289</yMin>
        <xMax>-230</xMax>
        <yMax>440.398438</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>The signal appears to be a raider base of operations. You spot several crudely drawn signs warning people to keep out. Some of them depict mines.</Text>
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
                <x>369</x>
                <y>65</y>
                <center>
                  <x>374</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>369</xMin>
                <yMin>65</yMin>
                <xMax>379</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
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
                <x>369</x>
                <y>83</y>
                <center>
                  <x>374</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>369</xMin>
                <yMin>83</yMin>
                <xMax>379</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Enter the supposed minefield to fight the raiders.</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
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
            </ButtonAction>
          </Actions>
          <Name>Ignore the raiders, entering a minefield isn't worth it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-333</x>
        <y>706</y>
        <center>
          <x>-258</x>
          <y>756</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>-333</xMin>
        <yMin>706</yMin>
        <xMax>-183</xMax>
        <yMax>806</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
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
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-109</x>
        <y>200</y>
        <center>
          <x>-14</x>
          <y>275.699219</y>
        </center>
        <width>190</width>
        <height>151.398438</height>
        <xMin>-109</xMin>
        <yMin>200</yMin>
        <xMax>81</xMax>
        <yMax>351.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As your scanner picks up multiple readings of mines you realize the raiders weren't lying.

Also, they saw you coming and move in to engage.</Text>
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
            </ButtonAction>
          </Actions>
          <Name>Prepare for combat.</Name>
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
                <x>178</x>
                <y>109</y>
                <center>
                  <x>183</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>178</xMin>
                <yMin>109</yMin>
                <xMax>188</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>4</ToDialog>
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
                <x>178</x>
                <y>127</y>
                <center>
                  <x>183</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>178</xMin>
                <yMin>127</yMin>
                <xMax>188</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Try to escape.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-113</x>
        <y>395</y>
        <center>
          <x>-16</x>
          <y>470.699219</y>
        </center>
        <width>194</width>
        <height>151.398438</height>
        <xMin>-113</xMin>
        <yMin>395</yMin>
        <xMax>81</xMax>
        <yMax>546.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your scanner doesn't pick up any signs of mines, looks like the raiders were just bluffing.

Regardless, they've noticed your convoy and move in to engage.</Text>
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
            </ButtonAction>
          </Actions>
          <Name>Prepare your weapons.</Name>
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
                <x>182</x>
                <y>109</y>
                <center>
                  <x>187</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>109</yMin>
                <xMax>192</xMax>
                <yMax>119</yMax>
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
                <x>182</x>
                <y>127</y>
                <center>
                  <x>187</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>182</xMin>
                <yMin>127</yMin>
                <xMax>192</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Try to escape.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>195</x>
        <y>148</y>
        <center>
          <x>320.5</x>
          <y>223.699219</y>
        </center>
        <width>251</width>
        <height>151.398438</height>
        <xMin>195</xMin>
        <yMin>148</yMin>
        <xMax>446</xMax>
        <yMax>299.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Racing through a minefield turned out to be a bad idea, one of your vehicles gets hit by an explosion.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>239</x>
                <y>65</y>
                <center>
                  <x>244</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>239</xMin>
                <yMin>65</yMin>
                <xMax>249</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>192</AmountAP>
              <AmountHP>210</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Better fight them head on, then!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>239</x>
                <y>109</y>
                <center>
                  <x>244</x>
                  <y>114</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>239</xMin>
                <yMin>109</yMin>
                <xMax>249</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>150</AmountAP>
              <AmountHP>249</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>239</x>
                <y>127</y>
                <center>
                  <x>244</x>
                  <y>132</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>239</xMin>
                <yMin>127</yMin>
                <xMax>249</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <AmountAP>382</AmountAP>
              <AmountHP>188</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Damn... keep going!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>218</x>
        <y>361</y>
        <center>
          <x>299.5</x>
          <y>411</y>
        </center>
        <width>163</width>
        <height>100</height>
        <xMin>218</xMin>
        <yMin>361</yMin>
        <xMax>381</xMax>
        <yMax>461</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You manage to evade the raiders and get out of there.</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="CloseDialog">
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
            </ButtonAction>
          </Actions>
          <Name>Phew...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>438</x>
        <y>517</y>
        <center>
          <x>516.5</x>
          <y>567</y>
        </center>
        <width>157</width>
        <height>100</height>
        <xMin>438</xMin>
        <yMin>517</yMin>
        <xMax>595</xMax>
        <yMax>617</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your attempts at evasion, the raiders catch up to you and start firing their weapons.</Text>
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
            </ButtonAction>
          </Actions>
          <Name>Fire weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>480</x>
        <y>117</y>
        <center>
          <x>575</x>
          <y>167</y>
        </center>
        <width>190</width>
        <height>100</height>
        <xMin>480</xMin>
        <yMin>117</yMin>
        <xMax>670</xMax>
        <yMax>217</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You prepare for combat.</Text>
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
            </ButtonAction>
          </Actions>
          <Name>Fire weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>W_D_R_Minefieldbase</Name>
</Scenario>