package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3e44f2a5;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24349
 */
public class TwinJet1 extends EntityType
{
    /** Default constructor */
    public TwinJet1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 24348, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 24349, Twin Jet
    }
}
