package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bf08014;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16585
 */
public class L763Plotze extends EntityType
{
    /** Default constructor */
    public L763Plotze()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 16562, Landing Craft
        setSubCategory((byte)2); // uid 16581, Type 520 (LCUs)
        setSpecific((byte)4); // uid 16585, L 763 Plotze
    }
}
