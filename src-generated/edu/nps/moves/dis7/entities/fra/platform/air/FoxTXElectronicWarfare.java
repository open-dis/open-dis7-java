package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6fd83fc1;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23680
 */
public class FoxTXElectronicWarfare extends EntityType
{
    /** Default constructor */
    public FoxTXElectronicWarfare()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 23676, Unmanned
        setSubCategory((byte)1); // uid 23677, CAC Fox
        setSpecific((byte)3); // uid 23680, Fox TX Electronic Warfare
    }
}
