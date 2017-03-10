<?xml version="1.0" encoding="utf-8"?>
<Scenario xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
  <objectiveNumber>0</objectiveNumber>
  <scenarioType>Ambush</scenarioType>
  <FilePath>D:/Convoy/Assets/StreamingAssets/ObjectiveScenarios/Q_FluxCapacitor_PylonReturn.sc</FilePath>
  <BiomeType>Road</BiomeType>
  <CombatEndDialog>1</CombatEndDialog>
  <StartDialog>0</StartDialog>
  <CurrentDialog>0</CurrentDialog>
  <ShowGUI>false</ShowGUI>
  <Dialogs>
    <Dialog>
      <GraphRect>
        <x>187</x>
        <y>486</y>
        <center>
          <x>281.5</x>
          <y>563.5</y>
        </center>
        <width>189</width>
        <height>155</height>
        <xMin>187</xMin>
        <yMin>486</yMin>
        <xMax>376</xMax>
        <yMax>641</yMax>
      </GraphRect>
      <Name>Start dialog</Name>
      <Text>You return to the professor's laboratory.</Text>
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
                <x>177</x>
                <y>65</y>
                <center>
                  <x>182</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>177</xMin>
                <yMin>65</yMin>
                <xMax>187</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>2</Chance>
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
                <x>177</x>
                <y>83</y>
                <center>
                  <x>182</x>
                  <y>88</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>177</xMin>
                <yMin>83</yMin>
                <xMax>187</xMax>
                <yMax>93</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>6</ToDialog>
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
                <x>177</x>
                <y>101</y>
                <center>
                  <x>182</x>
                  <y>106</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>177</xMin>
                <yMin>101</yMin>
                <xMax>187</xMax>
                <yMax>111</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>7</ToDialog>
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
                <x>177</x>
                <y>119</y>
                <center>
                  <x>182</x>
                  <y>124</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>177</xMin>
                <yMin>119</yMin>
                <xMax>187</xMax>
                <yMax>129</yMax>
              </ButtonRect>
              <Chance>2</Chance>
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
                <x>177</x>
                <y>137</y>
                <center>
                  <x>182</x>
                  <y>142</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>177</xMin>
                <yMin>137</yMin>
                <xMax>187</xMax>
                <yMax>147</yMax>
              </ButtonRect>
              <Chance>2</Chance>
              <ToDialog>3</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Approach the laboratory.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>220</x>
        <y>887</y>
        <center>
          <x>295</x>
          <y>937</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>220</xMin>
        <yMin>887</yMin>
        <xMax>370</xMax>
        <yMax>987</yMax>
      </GraphRect>
      <Name>Loot dialog</Name>
      <Text>You defeat the final raider vehicle that was attacking the laboratory.

[0loot]

The professor runs out of the laboratory and approaches your convoy.</Text>
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
              <ToDialog>4</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
              <Amount>0</Amount>
            </ButtonAction>
          </Actions>
          <Name>Let's hear it.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>479</x>
        <y>138</y>
        <center>
          <x>584.5</x>
          <y>188</y>
        </center>
        <width>211</width>
        <height>100</height>
        <xMin>479</xMin>
        <yMin>138</yMin>
        <xMax>690</xMax>
        <yMax>238</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon entering the laboratory, you find the professor sleeping behind a cluttered desk, his head resting on piles of scribbled notes.

He suddenly wakes up and exclaims: "Yes! Milspec! Of course! Those bastards!" before noticing you.

"Ah! Hello! Welcome back! Ha-hah! Don't mind what I just said."</Text>
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
                <x>199</x>
                <y>65</y>
                <center>
                  <x>204</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>199</xMin>
                <yMin>65</yMin>
                <xMax>209</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We've got the Energy Pylon.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>465</x>
        <y>666</y>
        <center>
          <x>540</x>
          <y>716</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>465</xMin>
        <yMin>666</yMin>
        <xMax>615</xMax>
        <yMax>766</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>As you approach the laboratory, you hear the unmistakable sounds of combat.

It appears the professor is being attacked by raiders.</Text>
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
          <Name>Intervene!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>461</x>
        <y>845</y>
        <center>
          <x>565</x>
          <y>895</y>
        </center>
        <width>208</width>
        <height>100</height>
        <xMin>461</xMin>
        <yMin>845</yMin>
        <xMax>669</xMax>
        <yMax>945</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Gah!

Another bunch of disgruntled raiders unhappy about my... belated... paying for... services.

Many thanks for your help disposing of them, ha-hah!"</Text>
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
                <x>196</x>
                <y>65</y>
                <center>
                  <x>201</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>196</xMin>
                <yMin>65</yMin>
                <xMax>206</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We've got the Energy Pylon.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>873</x>
        <y>479</y>
        <center>
          <x>948.5</x>
          <y>529</y>
        </center>
        <width>151</width>
        <height>100</height>
        <xMin>873</xMin>
        <yMin>479</yMin>
        <xMax>1024</xMax>
        <yMax>579</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>"Great! Wonderful! Excellent!

Ha-hah! This is amazing! A functional T.O.R.V.A.K. Energy Pylon. I've wanted to get my hands on one of these for ages!

Yes yes yes, I'll get your Flux Capacitor running, no problem! Just a moment."

The professor takes the Energy Pylon and starts tinkering with it.</Text>
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
              <ToDialog>9</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>Wait...</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>491</x>
        <y>268</y>
        <center>
          <x>596.5</x>
          <y>318</y>
        </center>
        <width>211</width>
        <height>100</height>
        <xMin>491</xMin>
        <yMin>268</yMin>
        <xMax>702</xMax>
        <yMax>368</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon entering the laboratory, you find the professor working amidst a variety of bubbling vials and beakers.

He notices your arrival, then says: "Hello! Welcome back!"</Text>
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
                <x>199</x>
                <y>65</y>
                <center>
                  <x>204</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>199</xMin>
                <yMin>65</yMin>
                <xMax>209</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We've got the Energy Pylon.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>512</x>
        <y>383</y>
        <center>
          <x>617.5</x>
          <y>433</y>
        </center>
        <width>211</width>
        <height>100</height>
        <xMin>512</xMin>
        <yMin>383</yMin>
        <xMax>723</xMax>
        <yMax>483</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon entering the laboratory, you find the professor working underneath a massive piece of machinery.

He notices your arrival, then says: "Hello! Welcome back!"</Text>
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
                <x>199</x>
                <y>65</y>
                <center>
                  <x>204</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>199</xMin>
                <yMin>65</yMin>
                <xMax>209</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We've got the Energy Pylon.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>504</x>
        <y>509</y>
        <center>
          <x>609.5</x>
          <y>559</y>
        </center>
        <width>211</width>
        <height>100</height>
        <xMin>504</xMin>
        <yMin>509</yMin>
        <xMax>715</xMax>
        <yMax>609</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>Upon entering the laboratory, you find the professor busy welding various bits of metal together, looking exceptionally pleased with himself.

He notices your arrival, then says: "Hello! Welcome back!"</Text>
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
                <x>199</x>
                <y>65</y>
                <center>
                  <x>204</x>
                  <y>70</y>
                </center>
                <width>10</width>
                <height>10</height>
                <xMin>199</xMin>
                <yMin>65</yMin>
                <xMax>209</xMax>
                <yMax>75</yMax>
              </ButtonRect>
              <Chance>1</Chance>
              <ToDialog>5</ToDialog>
              <Close>true</Close>
              <Enabled>true</Enabled>
            </ButtonAction>
          </Actions>
          <Name>We've got the Energy Pylon.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1103</x>
        <y>459</y>
        <center>
          <x>1178</x>
          <y>509</y>
        </center>
        <width>150</width>
        <height>100</height>
        <xMin>1103</xMin>
        <yMin>459</yMin>
        <xMax>1253</xMax>
        <yMax>559</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>After some time, the professor approaches you.

"Got it all working! Ready for you to take back to your spaceship.

The Energy Pylon has some energy left, but don't worry about it. I'll find some uses for it! Hee-hee!"

He appears to have a slight maniacal grin on his face.

</Text>
      <DialogButtons>
        <DialogButton>
          <Actions>
            <ButtonAction xsi:type="AddCargo">
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
          </Actions>
          <Name>Move out.</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
    <Dialog>
      <GraphRect>
        <x>1341</x>
        <y>418</y>
        <center>
          <x>1419.5</x>
          <y>468</y>
        </center>
        <width>157</width>
        <height>100</height>
        <xMin>1341</xMin>
        <yMin>418</yMin>
        <xMax>1498</xMax>
        <yMax>518</yMax>
      </GraphRect>
      <Name>New dialog</Name>
      <Text>You thank the professor and say goodbye, before loading the Flux Capacitor onto your convoy.</Text>
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
          <Name>Let's go!</Name>
        </DialogButton>
      </DialogButtons>
    </Dialog>
  </Dialogs>
  <Name>Q_FluxCapacitor_PylonReturn</Name>
</Scenario>