package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d0d9fe7;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 22710
 */
public class L9014Tonnerre extends EntityType
{
    /** Default constructor */
    public L9014Tonnerre()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 22707, Amphibious Assault Ship
        setSubCategory((byte)1); // uid 22708, Mistral class
        setSpecific((byte)2); // uid 22710, L9014 Tonnerre
    }
}
