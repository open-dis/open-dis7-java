package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e55dd0c;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15783
 */
public class AlphaJetE extends EntityType
{
    /** Default constructor */
    public AlphaJetE()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 15776, Attack/Strike
        setSubCategory((byte)4); // uid 15781, Dassault/Dornier Alpha Jet
        setSpecific((byte)2); // uid 15783, Alpha Jet E
    }
}
