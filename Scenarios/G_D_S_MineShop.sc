﻿<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Radio</scenarioType>
  <FilePath>C:/Program Files (x86)/Unity/Convoy/Assets/StreamingAssets/Scenarios/G_D_S_MineShop.sc</FilePath>
  <BiomeType>DirtRoad</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>-169</x>
        <y>358</y>
        <position>
          <x>-169</x>
          <y>358</y>
        </position>
        <center>
          <x>-90.5</x>
          <y>421.5</y>
        </center>
        <min>
          <x>-169</x>
          <y>358</y>
        </min>
        <max>
          <x>-12</x>
          <y>485</y>
        </max>
        <width>157</width>
        <height>127</height>
        <size>
          <x>157</x>
          <y>127</y>
        </size>
        <xMin>-169</xMin>
        <yMin>358</yMin>
        <xMax>-12</xMax>
        <yMax>485</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You see a sign in the distance.</Text>
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
                <position>
                  <x>145</x>
                  <y>65</y>
                </position>
                <center>
                  <x>150</x>
                  <y>70</y>
                </center>
                <min>
                  <x>145</x>
                  <y>65</y>
                </min>
                <max>
                  <x>155</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>145</xMin>
                <yMin>65</yMin>
                <xMax>155</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>2</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Drive closer.</Name>
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
          <Name>Ignore it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>-153</x>
        <y>629</y>
        <position>
          <x>-153</x>
          <y>629</y>
        </position>
        <center>
          <x>-78</x>
          <y>679.5</y>
        </center>
        <min>
          <x>-153</x>
          <y>629</y>
        </min>
        <max>
          <x>-3</x>
          <y>730</y>
        </max>
        <width>150</width>
        <height>101</height>
        <size>
          <x>150</x>
          <y>101</y>
        </size>
        <xMin>-153</xMin>
        <yMin>629</yMin>
        <xMax>-3</xMax>
        <yMax>730</yMax>
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
                <x>138</x>
                <y>65</y>
                <position>
                  <x>138</x>
                  <y>65</y>
                </position>
                <center>
                  <x>143</x>
                  <y>70</y>
                </center>
                <min>
                  <x>138</x>
                  <y>65</y>
                </min>
                <max>
                  <x>148</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
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
            <ButtonAction xsi:type="AddLoot">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>138</x>
                <y>83</y>
                <position>
                  <x>138</x>
                  <y>83</y>
                </position>
                <center>
                  <x>143</x>
                  <y>88</y>
                </center>
                <min>
                  <x>138</x>
                  <y>83</y>
                </min>
                <max>
                  <x>148</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>138</xMin>
                <yMin>83</yMin>
                <xMax>148</xMax>
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
        <x>73</x>
        <y>343</y>
        <position>
          <x>73</x>
          <y>343</y>
        </position>
        <center>
          <x>229</x>
          <y>418.699219</y>
        </center>
        <min>
          <x>73</x>
          <y>343</y>
        </min>
        <max>
          <x>385</x>
          <y>494.398438</y>
        </max>
        <width>312</width>
        <height>151.398438</height>
        <size>
          <x>312</x>
          <y>151.398438</y>
        </size>
        <xMin>73</xMin>
        <yMin>343</yMin>
        <xMax>385</xMax>
        <yMax>494.398438</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>The sign reads: "Free trading ahead!"</Text>
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
                <x>300</x>
                <y>65</y>
                <position>
                  <x>300</x>
                  <y>65</y>
                </position>
                <center>
                  <x>305</x>
                  <y>70</y>
                </center>
                <min>
                  <x>300</x>
                  <y>65</y>
                </min>
                <max>
                  <x>310</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>300</xMin>
                <yMin>65</yMin>
                <xMax>310</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>5</Chance>
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
                <x>300</x>
                <y>83</y>
                <position>
                  <x>300</x>
                  <y>83</y>
                </position>
                <center>
                  <x>305</x>
                  <y>88</y>
                </center>
                <min>
                  <x>300</x>
                  <y>83</y>
                </min>
                <max>
                  <x>310</x>
                  <y>93</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>300</xMin>
                <yMin>83</yMin>
                <xMax>310</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>5</Chance>
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Follow the directions.</Name>
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
          <Name>Leave, there's no such thing.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>481</x>
        <y>162</y>
        <position>
          <x>481</x>
          <y>162</y>
        </position>
        <center>
          <x>583.5</x>
          <y>244.5</y>
        </center>
        <min>
          <x>481</x>
          <y>162</y>
        </min>
        <max>
          <x>686</x>
          <y>327</y>
        </max>
        <width>205</width>
        <height>165</height>
        <size>
          <x>205</x>
          <y>165</y>
        </size>
        <xMin>481</xMin>
        <yMin>162</yMin>
        <xMax>686</xMax>
        <yMax>327</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You see a new sign: "Haha, we lied. Prepare to die!"

A number of privateer vehicles race towards you!</Text>
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Open fire!</Name>
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
                <y>109</y>
                <position>
                  <x>193</x>
                  <y>109</y>
                </position>
                <center>
                  <x>198</x>
                  <y>114</y>
                </center>
                <min>
                  <x>193</x>
                  <y>109</y>
                </min>
                <max>
                  <x>203</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>109</yMin>
                <xMax>203</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>8</ToDialog>
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
                <y>127</y>
                <position>
                  <x>193</x>
                  <y>127</y>
                </position>
                <center>
                  <x>198</x>
                  <y>132</y>
                </center>
                <min>
                  <x>193</x>
                  <y>127</y>
                </min>
                <max>
                  <x>203</x>
                  <y>137</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>127</yMin>
                <xMax>203</xMax>
                <yMax>137</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>7</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>76</AmountAP>
              <AmountHP>47</AmountHP>
            </ButtonAction>
            <ButtonAction xsi:type="DamageRandomCar">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>193</x>
                <y>145</y>
                <position>
                  <x>193</x>
                  <y>145</y>
                </position>
                <center>
                  <x>198</x>
                  <y>150</y>
                </center>
                <min>
                  <x>193</x>
                  <y>145</y>
                </min>
                <max>
                  <x>203</x>
                  <y>155</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>193</xMin>
                <yMin>145</yMin>
                <xMax>203</xMax>
                <yMax>155</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>6</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <amount>1</amount>
              <random>false</random>
              <AmountAP>360</AmountAP>
              <AmountHP>260</AmountHP>
            </ButtonAction>
          </Actions>
          <Name>Try to flee!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>458</x>
        <y>524</y>
        <position>
          <x>458</x>
          <y>524</y>
        </position>
        <center>
          <x>573.5</x>
          <y>587.5</y>
        </center>
        <min>
          <x>458</x>
          <y>524</y>
        </min>
        <max>
          <x>689</x>
          <y>651</y>
        </max>
        <width>231</width>
        <height>127</height>
        <size>
          <x>231</x>
          <y>127</y>
        </size>
        <xMin>458</xMin>
        <yMin>524</yMin>
        <xMax>689</xMax>
        <yMax>651</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>In the distance, you see a group of traders parked by the road.</Text>
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
                <x>219</x>
                <y>65</y>
                <position>
                  <x>219</x>
                  <y>65</y>
                </position>
                <center>
                  <x>224</x>
                  <y>70</y>
                </center>
                <min>
                  <x>219</x>
                  <y>65</y>
                </min>
                <max>
                  <x>229</x>
                  <y>75</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>219</xMin>
                <yMin>65</yMin>
                <xMax>229</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Ask about the "Free trading".</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>795</x>
        <y>491</y>
        <position>
          <x>795</x>
          <y>491</y>
        </position>
        <center>
          <x>934.5</x>
          <y>626.332031</y>
        </center>
        <min>
          <x>795</x>
          <y>491</y>
        </min>
        <max>
          <x>1074</x>
          <y>761.664063</y>
        </max>
        <width>279</width>
        <height>270.664063</height>
        <size>
          <x>279</x>
          <y>270.664063</y>
        </size>
        <xMin>795</xMin>
        <yMin>491</yMin>
        <xMax>1074</xMax>
        <yMax>761.664063</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>One of the merchants claims: "You are free to trade anything here", explaining it is mostly a marketing trick.

Right now, we really need our weapons to defend ourselves... so you can buy one of these if you were so inclined!"</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="BuyItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>147</x>
                <y>109</y>
                <position>
                  <x>147</x>
                  <y>109</y>
                </position>
                <center>
                  <x>152</x>
                  <y>114</y>
                </center>
                <min>
                  <x>147</x>
                  <y>109</y>
                </min>
                <max>
                  <x>157</x>
                  <y>119</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>147</xMin>
                <yMin>109</yMin>
                <xMax>157</xMax>
                <yMax>119</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <item>0</item>
              <ranomItem>true</ranomItem>
            </ButtonAction>
          </Actions>
          <Name>[shop]</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="BuyItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>147</x>
                <y>153</y>
                <position>
                  <x>147</x>
                  <y>153</y>
                </position>
                <center>
                  <x>152</x>
                  <y>158</y>
                </center>
                <min>
                  <x>147</x>
                  <y>153</y>
                </min>
                <max>
                  <x>157</x>
                  <y>163</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>147</xMin>
                <yMin>153</yMin>
                <xMax>157</xMax>
                <yMax>163</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <item>0</item>
              <ranomItem>true</ranomItem>
            </ButtonAction>
          </Actions>
          <Name>[shop]</Name>
        </DialogButton>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="BuyItem">
              <ActionLoot>
                <Items />
                <Fuel>0</Fuel>
                <Junk>0</Junk>
              </ActionLoot>
              <ButtonRect>
                <x>147</x>
                <y>197</y>
                <position>
                  <x>147</x>
                  <y>197</y>
                </position>
                <center>
                  <x>152</x>
                  <y>202</y>
                </center>
                <min>
                  <x>147</x>
                  <y>197</y>
                </min>
                <max>
                  <x>157</x>
                  <y>207</y>
                </max>
                <width>10</width>
                <height>10</height>
                <size>
                  <x>10</x>
                  <y>10</y>
                </size>
                <xMin>147</xMin>
                <yMin>197</yMin>
                <xMax>157</xMax>
                <yMax>207</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>100</ToDialog>
              <Close>false</Close>
              <Enabled>true</Enabled>
              <item>0</item>
              <ranomItem>true</ranomItem>
            </ButtonAction>
          </Actions>
          <Name>[shop]</Name>
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
          <Name>Curse those marketing shenanigens.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>787</x>
        <y>323</y>
        <position>
          <x>787</x>
          <y>323</y>
        </position>
        <center>
          <x>876.5</x>
          <y>373</y>
        </center>
        <min>
          <x>787</x>
          <y>323</y>
        </min>
        <max>
          <x>966</x>
          <y>423</y>
        </max>
        <width>179</width>
        <height>100</height>
        <size>
          <x>179</x>
          <y>100</y>
        </size>
        <xMin>787</xMin>
        <yMin>323</yMin>
        <xMax>966</xMax>
        <yMax>423</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you tried to escape the attackers, you unwittingly headed straight into a minefield.

One of your vehicles has been caught in a blast!

You have no choice but to fight now.</Text>
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
              <enemyType>Privateers</enemyType>
              <difficulty>0</difficulty>
            </ButtonAction>
          </Actions>
          <Name>Ready weapons!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>787</x>
        <y>188</y>
        <position>
          <x>787</x>
          <y>188</y>
        </position>
        <center>
          <x>865.5</x>
          <y>238</y>
        </center>
        <min>
          <x>787</x>
          <y>188</y>
        </min>
        <max>
          <x>944</x>
          <y>288</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>787</xMin>
        <yMin>188</yMin>
        <xMax>944</xMax>
        <yMax>288</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You've managed to outrun the would-be attackers, but they managed to get a shot in on one of your vehicles.</Text>
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
          <Name>Onwards...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>792</x>
        <y>45</y>
        <position>
          <x>792</x>
          <y>45</y>
        </position>
        <center>
          <x>870.5</x>
          <y>95</y>
        </center>
        <min>
          <x>792</x>
          <y>45</y>
        </min>
        <max>
          <x>949</x>
          <y>145</y>
        </max>
        <width>157</width>
        <height>100</height>
        <size>
          <x>157</x>
          <y>100</y>
        </size>
        <xMin>792</xMin>
        <yMin>45</yMin>
        <xMax>949</xMax>
        <yMax>145</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You've managed to outrun the would-be attackers!</Text>
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
          <Name>Great!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>110</x>
        <y>685</y>
        <position>
          <x>110</x>
          <y>685</y>
        </position>
        <center>
          <x>226</x>
          <y>735</y>
        </center>
        <min>
          <x>110</x>
          <y>685</y>
        </min>
        <max>
          <x>342</x>
          <y>785</y>
        </max>
        <width>232</width>
        <height>100</height>
        <size>
          <x>232</x>
          <y>100</y>
        </size>
        <xMin>110</xMin>
        <yMin>685</yMin>
        <xMax>342</xMax>
        <yMax>785</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You head back to the initial "Free trading ahead" sign and fire your weapons at it out of spite.</Text>
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
          <Name>Damn marketing shenanigens...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>G_D_S_MineShop</Name>
</Scenario>