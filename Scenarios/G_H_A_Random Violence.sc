﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>C:/Users/Ryanne/Desktop/Convoy/Assets/StreamingAssets/Scenarios/G_H_A_Random Violence.sc</FilePath>
  <BiomeType>DesertRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>254</x>
        <y>269</y>
        <position>
          <x>254</x>
          <y>269</y>
        </position>
        <center>
          <x>361</x>
          <y>359.5</y>
        </center>
        <min>
          <x>254</x>
          <y>269</y>
        </min>
        <max>
          <x>468</x>
          <y>450</y>
        </max>
        <width>214</width>
        <height>181</height>
        <size>
          <x>214</x>
          <y>181</y>
        </size>
        <xMin>254</xMin>
        <yMin>269</yMin>
        <xMax>468</xMax>
        <yMax>450</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>Suddenly you hear an explosion and notice you're under fire!</Text>
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
                <x>202</x>
                <y>65</y>
                <position>
                  <x>202</x>
                  <y>65</y>
                </position>
                <center>
                  <x>207</x>
                  <y>70</y>
                </center>
                <min>
                  <x>202</x>
                  <y>65</y>
                </min>
                <max>
                  <x>212</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>65</yMin>
                <xMax>212</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>3</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>true</random>
              <AmountAP>412</AmountAP>
              <AmountHP>145</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>83</y>
                <position>
                  <x>202</x>
                  <y>83</y>
                </position>
                <center>
                  <x>207</x>
                  <y>88</y>
                </center>
                <min>
                  <x>202</x>
                  <y>83</y>
                </min>
                <max>
                  <x>212</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>83</yMin>
                <xMax>212</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>2</amount>
              <random>true</random>
              <AmountAP>69</AmountAP>
              <AmountHP>111</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>101</y>
                <position>
                  <x>202</x>
                  <y>101</y>
                </position>
                <center>
                  <x>207</x>
                  <y>106</y>
                </center>
                <min>
                  <x>202</x>
                  <y>101</y>
                </min>
                <max>
                  <x>212</x>
                  <y>111</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>101</yMin>
                <xMax>212</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>3</amount>
              <random>true</random>
              <AmountAP>212</AmountAP>
              <AmountHP>50</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Prepare for an attack!</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>145</y>
                <position>
                  <x>202</x>
                  <y>145</y>
                </position>
                <center>
                  <x>207</x>
                  <y>150</y>
                </center>
                <min>
                  <x>202</x>
                  <y>145</y>
                </min>
                <max>
                  <x>212</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>145</yMin>
                <xMax>212</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>4</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
            <ButtonAction xsi:type="ModifyJunk">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>202</x>
                <y>163</y>
                <position>
                  <x>202</x>
                  <y>163</y>
                </position>
                <center>
                  <x>207</x>
                  <y>168</y>
                </center>
                <min>
                  <x>202</x>
                  <y>163</y>
                </min>
                <max>
                  <x>212</x>
                  <y>173</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>202</xMin>
                <yMin>163</yMin>
                <xMax>212</xMax>
                <yMax>173</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
              <fuelAmount>-5</fuelAmount>
            </ButtonAction>
          </Actions>
          <Name>Supercharge to escape! [#]</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>263</x>
        <y>568</y>
        <position>
          <x>263</x>
          <y>568</y>
        </position>
        <center>
          <x>359.5</x>
          <y>618.5</y>
        </center>
        <min>
          <x>263</x>
          <y>568</y>
        </min>
        <max>
          <x>456</x>
          <y>669</y>
        </max>
        <width>193</width>
        <height>101</height>
        <size>
          <x>193</x>
          <y>101</y>
        </size>
        <xMin>263</xMin>
        <yMin>568</yMin>
        <xMax>456</xMax>
        <yMax>669</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>[0loot]</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddRandomItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>173</x>
                <y>65</y>
                <position>
                  <x>173</x>
                  <y>65</y>
                </position>
                <center>
                  <x>178</x>
                  <y>70</y>
                </center>
                <min>
                  <x>173</x>
                  <y>65</y>
                </min>
                <max>
                  <x>183</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>173</xMin>
                <yMin>65</yMin>
                <xMax>183</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>1</Amount>
            </ButtonAction>
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>181</x>
                <y>83</y>
                <position>
                  <x>181</x>
                  <y>83</y>
                </position>
                <center>
                  <x>186</x>
                  <y>88</y>
                </center>
                <min>
                  <x>181</x>
                  <y>83</y>
                </min>
                <max>
                  <x>191</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>181</xMin>
                <yMin>83</yMin>
                <xMax>191</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Take loot.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>642</x>
        <y>243</y>
        <position>
          <x>642</x>
          <y>243</y>
        </position>
        <center>
          <x>720.5</x>
          <y>293</y>
        </center>
        <min>
          <x>642</x>
          <y>243</y>
        </min>
        <max>
          <x>799</x>
          <y>343</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>642</xMin>
        <yMin>243</yMin>
        <xMax>799</xMax>
        <yMax>343</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you warn the convoy, several enemies approach rapidly!

Looks like these roads aren't that safe.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Open fire!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>647</x>
        <y>493</y>
        <position>
          <x>647</x>
          <y>493</y>
        </position>
        <center>
          <x>722</x>
          <y>543</y>
        </center>
        <min>
          <x>647</x>
          <y>493</y>
        </min>
        <max>
          <x>797</x>
          <y>593</y>
        </max>
        <width>150</width>
        <height>100</height>
        <size>
          <x>150</x>
          <y>100</y>
        </size>
        <xMin>647</xMin>
        <yMin>493</yMin>
        <xMax>797</xMax>
        <yMax>593</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Despite your supercharged engines the attackers manage to catch up to you, you'll have to fight.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
                <xMin>0</xMin>
                <yMin>0</yMin>
                <xMax>0</xMax>
                <yMax>0</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <enemyType>Territory</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>641</x>
        <y>364</y>
        <position>
          <x>641</x>
          <y>364</y>
        </position>
        <center>
          <x>719.5</x>
          <y>414</y>
        </center>
        <min>
          <x>641</x>
          <y>364</y>
        </min>
        <max>
          <x>798</x>
          <y>464</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>641</xMin>
        <yMin>364</yMin>
        <xMax>798</xMax>
        <yMax>464</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Your supercharged engines get you out of danger safe and sound.</Text>
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
                <position>
                  <x>0</x>
                  <y>0</y>
                </position>
                <center>
                  <x>0</x>
                  <y>0</y>
                </center>
                <min>
                  <x>0</x>
                  <y>0</y>
                </min>
                <max>
                  <x>0</x>
                  <y>0</y>
                </max>
                <width>0</width>
                <height>0</height>
                <size>
                  <x>0</x>
                  <y>0</y>
                </size>
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
          <Name>Wonderful.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_H_A_Random Violence</Name>
</Scenario>