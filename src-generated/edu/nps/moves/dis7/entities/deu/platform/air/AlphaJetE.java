package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2205a05d;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16384
 */
public class AlphaJetE extends EntityType
{
    /** Default constructor */
    public AlphaJetE()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 16382, Trainer
        setSubCategory((byte)1); // uid 16383, Dassault/Dornier Alpha Jet
        setSpecific((byte)1); // uid 16384, Alpha Jet E
    }
}
