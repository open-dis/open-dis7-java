package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@389b0789;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16336
 */
public class AlphaJetMS1 extends EntityType
{
    /** Default constructor */
    public AlphaJetMS1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 16333, Attack/Strike
        setSubCategory((byte)1); // uid 16334, Dassault/Dornier Alpha Jet
        setSpecific((byte)2); // uid 16336, Alpha Jet MS1
    }
}
