package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6892b3b6;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15988
 */
public class M642Cassiopee extends EntityType
{
    /** Default constructor */
    public M642Cassiopee()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)2); // uid 15986, Eridan (Tripartite) class (minehunters)
        setSpecific((byte)2); // uid 15988, M 642 Cassiopee
    }
}
