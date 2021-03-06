package edu.nps.moves.dis7.entities.srb.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@766b6d02;
 * Country: Serbia (SRB);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 30186
 */
public class _82mmHEFRAGM81 extends EntityType
{
    /** Default constructor */
    public _82mmHEFRAGM81()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 30184, Ballistic
        setSubCategory((byte)1); // uid 30185, 82mm Recoilless Ammunition
        setSpecific((byte)1); // uid 30186, 82mm HE-FRAG M81
    }
}
