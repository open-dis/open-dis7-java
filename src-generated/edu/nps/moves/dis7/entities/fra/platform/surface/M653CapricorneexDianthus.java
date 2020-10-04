package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48075da3
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31283
 */
public class M653CapricorneexDianthus extends EntityType
{
    public M653CapricorneexDianthus()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)2); // uid 15986, Eridan (Tripartite) class (minehunters)
        setSpecific((byte)12); // uid 31283, M 653 Capricorne (ex-Dianthus)
    }
}
